import java.io.File;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input2.txt"));
        double miles = scan.nextDouble();
        System.out.printf("%.2f miles is %.2f kilometers",miles,miles * 1.69);
    }
}
