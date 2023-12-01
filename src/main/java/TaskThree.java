import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskThree {
    public String getSortedNumbers(String[] array) {
        return Arrays.stream(array)
                .flatMap(item -> Arrays.stream(item.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
