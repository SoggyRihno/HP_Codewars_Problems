import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input7.txt"));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals(".")) break;
            StringBuilder result = new StringBuilder();

            for (char c : line.toCharArray()) {
                result.append(switch (c) {
                    case 'G' -> 'C';
                    case 'C' -> 'G';
                    case 'T' -> 'A';
                    default -> 'T';
                });

            }
            System.out.println(result.reverse());
        }
    }
}
