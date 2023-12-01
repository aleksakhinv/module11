import java.util.Iterator;
import java.util.stream.Stream;

public class TaskFive {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream<T> resultStream = Stream.empty();

        Iterator<T> firstIt = first.iterator();
        Iterator<T> secondIt = second.iterator();

        while (firstIt.hasNext() && secondIt.hasNext()) {
            resultStream = Stream.concat(resultStream, Stream.of(firstIt.next()));
            resultStream = Stream.concat(resultStream, Stream.of(secondIt.next()));
        }

        return resultStream;
    }
}
