package leetCode75.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class num1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int j : arr) {
            result.put(j, result.getOrDefault(j, 0) + 1);
        }
        HashSet<Integer> values = new HashSet<>(result.values());

        return result.size() == values.size();
    }

    public static void main(String[] args) {
        int[] example = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(example));
    }
}
