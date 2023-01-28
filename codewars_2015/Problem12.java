import java.io.File;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input12.txt"));
        double current = scan.nextDouble();

        while (scan.hasNextDouble()) {
            double transaction = scan.nextDouble();

            if (transaction == 0) break;

            if (transaction % 5 == 0 && transaction + .5 < current )
                current -= transaction + .5;

            System.out.printf("%.2f %.2f%n",transaction,current);
        }

    }
}
