import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(List<Integer> arr) {
        return  arr.stream().map(x -> {
            if (x % 3 == 0 && x % 5 == 0) {
                return "fizz buzz";
            }
            if(x % 5 == 0) {
                return "buzz";
            }
            if(x % 3 == 0) {
                return "fizz";
            }

            return x.toString();
        }).collect(Collectors.toList());
    }
}
