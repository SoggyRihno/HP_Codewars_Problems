import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input6.txt"));
        int vowels = 0;
        int consonants = 0;

        while (scan.hasNextLine()) {
            for (char c : scan.nextLine().toLowerCase(Locale.ROOT).toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
                else if (c > 96 && c < 123) consonants++;
            }
        }

        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
        System.out.printf("Ratio: %.3f", (double) consonants / vowels);

    }
}
