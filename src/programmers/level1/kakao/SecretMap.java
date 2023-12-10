package programmers.level1.kakao;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 배열의 숫자들을 이진수로 변경(toBinaryString)
            // 비트 연산으로 or 수행 -> 하나라도 벽이면 '1'로 저장
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);

            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");

            // n 자리수가 될 때까지 앞에 공백을 추가해야한다
            while (answer[i].length() < n) {
                answer[i] = " " + answer[i];
            }
        }
        return answer;
    }
}
