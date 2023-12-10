package programmers;

import java.util.HashSet;

public class ponketmon {
    public static int solution(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : arr) {
            set.add(number);
        }

        return Math.min(set.size(), arr.length / 2);
    }

    public static void main(String[] args) {

    }
}
