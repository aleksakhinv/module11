import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Math.pow;

public class HomeworkTest {
    public static void main(String[] args) {
        List<String> testData = Arrays.asList("Vitalii", "Dima", "Inna", "Olena", "Valera", "Anton");

        System.out.println("--- Task #1 ---");
        TaskOne task1 = new TaskOne();
        System.out.println(task1.getOddIndexNames(testData));
        System.out.println();

        System.out.println("--- Task #2 ---");
        TaskTwo task2 = new TaskTwo();
        System.out.println(task2.getSortedNames(testData));
        System.out.println();

        System.out.println("--- Task #3 ---");
        TaskThree task3 = new TaskThree();
        String[] arrayStr = {"1, 2, 0", "4, 5"};
        System.out.println(task3.getSortedNumbers(arrayStr));
        System.out.println();

        System.out.println("--- Task #4 ---");
        TaskFour task4 = new TaskFour();
        long a = 25214903917L;
        long c = 11;
        long m = (long) pow(2, 48);
        Stream<Long> someValue = task4.linearCongruentMethod(a, c, m);
        someValue.forEach(System.out::println);
        System.out.println();

        System.out.println("--- Task #5 ---");
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8, 9, 10, 11);
        Stream<Integer> result = TaskFive.zip(first, second);
        result.forEach(System.out::println);


    }
}
