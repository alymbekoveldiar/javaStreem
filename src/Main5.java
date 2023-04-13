import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
