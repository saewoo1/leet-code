package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();

        while (n != 0) {
            answer.add((int) (n % 10));
            n /= 10;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
