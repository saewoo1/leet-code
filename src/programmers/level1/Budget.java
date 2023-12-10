package programmers.level1;

import java.util.Arrays;

public class Budget {
    /**
     * @param d      예산
     * @param budget 각 부서별 신청 금액
     * @return 가장 많은 부서를 지원하는 경우의 수
     */
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] >= 0) {
                answer++;
                budget -= d[i];
            } else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        System.out.println(solution(d, budget));
    }
}
