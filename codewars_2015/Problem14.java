import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Problem14 {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input14.txt"));

        Map<Character,Integer> map = Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals(".")) break;

            int result = map.get(line.charAt(line.length() - 1));

            for (int i = 0; i < line.length() - 1; i++) {
                int a = map.get((line.charAt(i)));
                int b = map.get((line.charAt(i + 1)));
                result += a * (a < b ? -1 : 1);
            }

            System.out.println(result);
        }
    }
}