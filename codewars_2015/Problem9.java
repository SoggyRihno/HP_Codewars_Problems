import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Problem9 {


    // no data
    public static void main(String[] args) throws IOException {
        Files.readAllLines(Path.of("Problem9.java")).stream()
                .filter(i->!i.isEmpty())
                .map(String::toUpperCase)
                .map(i->i.charAt(0)).forEach(System.out::print);
    }
}
