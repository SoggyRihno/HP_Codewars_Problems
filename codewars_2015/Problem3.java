import java.io.File;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input3.txt"));
        int n = scan.nextInt();
        scan.nextLine();

        int age = 0;
        if (n >= 2) age += 20 + ((n - 2) * 4);
        else age += n * 10;

        System.out.printf("%s is %d in human years%n", scan.next(), age);
    }
}