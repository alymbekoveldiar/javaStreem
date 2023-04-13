import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> even = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(even);
    }
}
