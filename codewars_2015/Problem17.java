import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input17.txt"));
        int n = scan.nextInt();
        scan.nextLine();


        Map<String, Double> map = new HashMap<>();


        for (int ll = 0; ll < n; ll++) {
            String[] line = scan.nextLine().split(" ");
            map.put(line[1], Double.parseDouble(line[0]));
        }
        map.put("EUR", 1.0);

        while (scan.hasNextLine()) {
            String[] line = scan.nextLine().split("in");
            if (line.length  ==1 )break;

            double original = Double.parseDouble(line[0].split(" ")[0]);
            String originalSymbol = line[0].split(" ")[1];
            String newSymbol = line[1].trim();
            System.out.printf("%.2f %s = %.2f %s%n", original, originalSymbol, original / map.get(originalSymbol) * map.get(newSymbol), newSymbol);
        }
    }

}
