import java.io.File;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input1.txt"));
        System.out.printf("Greetings, %s the Great! I genuflect in your general direction!", scan.next());

    }
}
