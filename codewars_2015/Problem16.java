import java.io.File;
import java.util.*;

public class Problem16 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input16.txt"));

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("0")) break;
            char[] a = line.toCharArray();
            Arrays.sort(a);
            rec( new String(a), "");
        }
    }


    public static void rec( String available, String current) {
        if (available.length() == 0)
            System.out.println(current);

        for (int i = 0; i < available.length(); i++) {
            rec( available.substring(0, i) + available.substring(i+1), current + available.charAt(i));
        }
    }
}
