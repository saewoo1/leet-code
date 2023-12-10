package programmers.level1.greedy;

import java.util.Arrays;

public class ReserveJudge {
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length; // 총 학생수 - 잃어버린 학생 수, 하지만 여기에 여분이 있는 애가 제거되어버린다.

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++; // 잃어버렸지만 여분이 있는 학생 -> answer 수 증가
                    break;
                }
            }
        }

        // 빌려주기
        for (int student : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] - 1 == student || reserve[i] + 1 == student) {
                    answer++; // 빌렸으니 들을 수 있는 학생 수 증가
                    reserve[i] = -1; // 빌려줌 -> 체육복 수 0
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 3, 4};
        int[] reserve = {1, 2, 3};
        System.out.println(solution(n, lost, reserve));
    }
}
