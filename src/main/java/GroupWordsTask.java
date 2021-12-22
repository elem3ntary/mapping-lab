import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<Character, Integer> groupIt(List<String> arr) {
       return  arr
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new,Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(GroupWordsTask::getKey, GroupWordsTask::updatedValue));
    }
    public static Integer updatedValue(Map.Entry<Character, List<String>> entry) {
        return entry.getValue().stream()
                .reduce(0, (total, curr) -> Math.toIntExact(total + curr.chars().filter(x -> x == entry.getKey()).count()), Integer::sum);
    }

    public static Character getKey(Map.Entry<Character, List<String>> entry ) {
        return entry.getKey();
    }
}
