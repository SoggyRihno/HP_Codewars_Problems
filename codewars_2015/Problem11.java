import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input11.txt"));
        List<Integer> sizes = new ArrayList<>();

        for (String s : scan.nextLine().split(" "))
            sizes.add(Integer.parseInt(s));

        while (scan.hasNextInt()) {
            int n = scan.nextInt();

            if (n == 0) break;

            System.out.print(n + " will require");
            List<String> jars = new ArrayList<>();

            for (int i = sizes.size()-1; i >=0; i--) {
                int used = n / sizes.get(i);
                n -= used * sizes.get(i);

                if (used !=0)
                    jars.add(" "+used + " jar(s) of " + sizes.get(i));
            }


            for (int i =0; i < jars.size(); i++){
                if (i != 0) System.out.print(",");
                System.out.print(jars.get(i));
            }
            System.out.println();
        }
    }
}