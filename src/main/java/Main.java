import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "def", "ghj");
        List<String> flat = FlattingTask.flattingStrings(input);
        System.out.println(Arrays.toString(IntStream.range(0,10).boxed().collect(Collectors.toList()).toArray()));

        System.out.println(FizzBuzzTask.fizzBuzzIt(IntStream.range(1,10).boxed().collect(Collectors.toList())));
        List<String> arr = Arrays.asList("ABCA", "BCD", "ABC");
        Map<Character, Integer> hash = GroupWordsTask.groupIt(arr);
        System.out.println(hash);
    }

}
