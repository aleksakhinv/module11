import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public List<String> getSortedNames(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
