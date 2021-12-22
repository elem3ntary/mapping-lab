import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr) {
       return arr.stream().map((x) -> {
            try {
                return Integer.parseInt(x);
            }catch (Exception e) {
                return null;
            }
        }).filter(x -> x != null).collect(Collectors.toList());
    }
}
