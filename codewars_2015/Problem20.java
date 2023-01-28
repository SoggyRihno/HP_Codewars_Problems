import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input20.txt"));
        int n = scan.nextInt();
        scan.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int ll = 0; ll < n; ll++) {
            String[] line = scan.nextLine().split(" ");
            String name = line[0] + " " + line[1];

            int days = (int) ChronoUnit.DAYS.between(LocalDate.parse(line[2], dateTimeFormatter), LocalDate.parse(line[3], dateTimeFormatter));

            System.out.printf("%s ruled for %d days%n",name,days);
        }
    }
}
