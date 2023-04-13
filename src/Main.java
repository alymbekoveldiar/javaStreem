import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = (int) getAverage(numbers);
        System.out.println(sum);
    }
    private static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }

}

