import java.io.File;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input8.txt"));
        // h and w
        scan.nextInt(); scan.nextInt();

        int[] result = new int[256];
        while (scan.hasNextInt())
            result[scan.nextInt()]++;

        for (int i = 0; i < 256; i +=16 ) {
            for (int j =i; j < i +16; j++)
                System.out.print(result[j] + " ");
            System.out.println();
        }
    }
}
