package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Supoza {
    public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                score[0] += 1;
            }
            if (answers[i] == two[i % two.length]) {
                score[1] += 1;
            }
            if (answers[i] == three[i % three.length]) {
                score[2] += 1;
            }
        }
        // 가장 많이 맞춘 사람
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> max = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                max.add(i + 1);
            }
        }
        return max.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] res = solution(new int[]{1, 2, 3, 4, 5});
        for (int re : res) {
            System.out.println("re = " + re);
        }
    }
}
