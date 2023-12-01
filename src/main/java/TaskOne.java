import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TaskOne {
    public String getOddIndexNames(List<String> list) {
        AtomicInteger i = new AtomicInteger(0);
        return list.stream()
                .filter(s -> i.getAndIncrement() % 2 == 1)
                .map(name -> (i.get() - 1) + ". " + name)
                .collect(Collectors.joining(", "));
    }
}
