import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        String dd = ",";
        StringJoiner joiner = new StringJoiner(dd);
        strings.forEach(item -> joiner.add(item));

        System.out.println(joiner);
    }
}
