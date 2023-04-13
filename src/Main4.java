import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(getMax(numbers));
    }
    public static Integer getMax(List<Integer> list)
    {
        return list.stream()
                .mapToInt(v -> v)
                .max()
                .orElse(Integer.MIN_VALUE);

    }
}
