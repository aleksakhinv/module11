import java.util.stream.Stream;

import static java.lang.Math.abs;

public class TaskFour {
    public Stream<Long> linearCongruentMethod(long a, long c, long m) {
        return Stream.iterate(System.currentTimeMillis(), x -> abs(((a * x + c) % m)))
                .limit(10);
    }
}
