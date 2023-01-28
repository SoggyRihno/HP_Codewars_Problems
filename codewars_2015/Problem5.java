import java.io.File;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input5.txt"));
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            boolean pal = true;
            for (int i = 0, j = s.length()-1; j > i; ) {
                char a = s.toLowerCase().charAt(i);
                char b = s.toLowerCase().charAt(j);

                if (a < 97 || a > 122) {
                    i++;
                } else if (b < 97 || b > 122) {
                    j--;
                }else if (a != b) {
                    pal = false;
                    break;
                } else {
                    i++;
                    j--;
                }
            }

            if (pal)
                System.out.printf("\"%s\" is a palindrome",s);
           else
                System.out.printf("\"%s\" is not a palindrome",s);
            System.out.println();
        }
    }
}