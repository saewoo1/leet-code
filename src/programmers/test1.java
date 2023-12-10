package programmers;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String runner : participant) {
            map.put(runner, map.getOrDefault(runner, 0) + 1);
        }
        for (String completer : completion) {
            map.put(completer, map.getOrDefault(completer, 0) - 1);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() != 0) {
                answer = pair.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] parti = {"leo", "kiki", "kiki"};
        String[] comple = {"leo", "kiki"};

        System.out.println(solution(parti, comple));
    }
}
