import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Problem22 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input22.txt"));
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int max = 0;
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            if (n == 0) break;

            List<Integer> primeFactors = new ArrayList<>();
            primeFactors(n, primeFactors);
            Collections.sort(primeFactors);
            map.put(n, primeFactors);
            max = Math.max(n, max);
        }

        for (Integer i : map.keySet().stream().sorted().toList()) {
            System.out.print(i + " = ");
            System.out.println(map.get(i).stream().map(Objects::toString).collect(Collectors.joining(" x ")));

        }

        int gcf = max;
        for (; gcf >= 0; gcf--) {
            boolean common = true;
            for (int j : map.keySet())
                if (j % gcf != 0) {
                    common = false;
                    break;
                }
            if (common) break;
        }

        List<Integer> commonFactors = new ArrayList<>();
        primeFactors(gcf, commonFactors);

        System.out.print("The greatest common divisor is ");
        System.out.print(commonFactors.stream().sorted().map(Objects::toString).collect(Collectors.joining(" x ")));
        System.out.println(" = " + gcf);

        int lcm = gcf;

        for (Integer i : map.keySet())
            lcm *= (i / gcf);

        System.out.print("The least common multiple is ");
        List<Integer> factors = new ArrayList<>();
        primeFactors(lcm, factors);
        System.out.print(factors.stream().sorted().map(Objects::toString).collect(Collectors.joining(" x ")));
        System.out.println(" = " + lcm);
    }

    public static void primeFactors(int n, List<Integer> factors) {
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                primeFactors(n / i, factors);
                primeFactors(i, factors);
                return;
            }
        }
        factors.add(n);
    }
}