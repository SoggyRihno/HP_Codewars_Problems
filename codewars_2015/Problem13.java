import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem13 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input13.txt"));
        int n = scan.nextInt();
        scan.nextLine();
        Map<String,Integer> map = new HashMap<>();

        for (int ll = 0; ll < n; ll++) {
            map.compute(scan.nextLine(), (k,v) -> v == null ? 1 : v + 1);
        }

        for(String s : map.keySet().stream().sorted((a,b) ->map.get(b) - map.get(a)).collect(Collectors.toList()))
            System.out.println(map.get(s) + " "+ s);
    }
}
