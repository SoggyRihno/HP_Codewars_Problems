import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Problem23 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input23.txt"));

        double k = scan.nextDouble();
        List<Double> bids = new ArrayList<>();
        List<Double> asks = new ArrayList<>();
        List<Double> both = new ArrayList<>();

        boolean ask = false;

        while (scan.hasNextDouble()) {
            double d = scan.nextDouble();

            if (d == -1) {
                if (ask) break;
                ask = true;
                continue;
            }
            if (ask) asks.add(d);
            else bids.add(d);
            both.add(d);
        }

        Collections.sort(both);
        double price = k * both.get(both.size() - asks.size() - 1) + (1 - k) * both.get(both.size() - asks.size());

        asks = asks.stream().sorted().filter(i -> i < price).toList();
        bids = bids.stream().sorted((a,b)-> -1 * a.compareTo(b)).filter(i -> i > price).toList();

        if (asks.size() > bids.size())
            asks = asks.subList(0, bids.size());
        if (bids.size() > asks.size())
            bids = bids.subList(0, asks.size());

        System.out.println("Price: " + price);
        System.out.println("Asks sold: " + asks.stream().map(Objects::toString).collect(Collectors.joining(", ")));
        System.out.println("Bids sold: " + bids.stream().map(Objects::toString).collect(Collectors.joining(", ")));
    }
}
