import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem18 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input18.txt"));
        List<Integer> list = new ArrayList<>();

        while (scan.hasNextInt()) {
            int i = scan.nextInt();
            if (i !=-1)
                list.add(i);
        }
        TreeNode root = new TreeNode(list.get(0));
        for (int i : list.subList(1, list.size()))
            root.add(i);

        System.out.println(list.stream().sorted().map(Object::toString).collect(Collectors.joining(" ")));
        root.print();
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
    
    public void add(int i) {
        if (i < val) {
            if (left == null)
                left = new TreeNode(i);
            else left.add(i);
        }else {
            if (right == null)
                right = new TreeNode(i);
            else right.add(i);
        }
    }
    
    public void print(){
        if (left != null) left.print();
        if (right != null) right.print();
        System.out.print(val + " ");
    }
}