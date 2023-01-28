import java.io.File;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input4.txt"));
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            boolean prime = true;

            for (int i = 2; i < n / 2 + 1; i++)
                if (n % i == 0) {
                    prime = false;
                    break;
                }

            if (prime)
                System.out.println(n + " is prime");
            else
                System.out.println(n + " not is prime");
        }
    }
}
