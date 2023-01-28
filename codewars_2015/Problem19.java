import java.io.File;
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input19.txt"));
        int n = scan.nextInt();
        scan.nextLine();

        String[] genes = new String[n];
        for (int i = 0; i < n; i++)
            genes[i] = scan.nextLine();

        String full = scan.nextLine();

        for (String gene : genes) {
            boolean found = false;
            for (int i = 0; i < full.length() - gene.length() - 1; i++) {
                int mutations = 0;

                String window = full.substring(i, i + gene.length());
                for (int j = 0; j < window.length(); j++) {
                    if (window.charAt(j) != gene.charAt(j)) {
                        mutations++;
                    }
                    if (mutations > 1) break;
                }
                if (mutations < 2) {
                    System.out.println(i + 1 + " " + mutations);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println(0);
        }
    }
}