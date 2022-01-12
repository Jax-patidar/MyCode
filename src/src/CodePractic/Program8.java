package CodePractic;
import java.util.*;
import java.util.stream.Collectors;

public class Program8 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(3,5);
        map.put(4,2);
        map.put(1,6);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey());

    }
}
