import java.io.File;

import java.util.*;

public class Problem15 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input15.txt"));
        int n = scan.nextInt();
        int[] hours = new int[25];

        for (int i =0; i < n; i ++ ){
            int arrive = scan.nextInt();
            int leave = scan.nextInt();

            for(int t =arrive; t <leave; t++)
                hours[t-1]++;
        }

        int max =0;
        for (int i : hours)
            max = Math.max(max,i);
        System.out.println(max);
    }
}
