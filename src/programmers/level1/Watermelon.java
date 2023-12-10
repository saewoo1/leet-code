package programmers.level1;

public class Watermelon {
    /**
     * @param n 수박을 반복
     * @return 홀수 -> 수박수 짝수 -> 수박수박
     */
    public static String solution(int n) {
        boolean even;
        even = n % 2 == 0;
        String watermelon = "수박";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(watermelon);
        }
        if (!even) {
            sb.append("수");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
