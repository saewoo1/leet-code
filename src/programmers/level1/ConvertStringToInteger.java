package programmers.level1;

public class ConvertStringToInteger {
    public static int solution(String s) {
        boolean sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char number = s.charAt(i);
            if (number == '-') {
                sign = false; // 음수 판정
            } else if (number != '+') { // 부호가 없는 경우
                result = result * 10 + (number - '0');
            }
        }
        return !sign ? result * (-1) : result;
    }

    public static void main(String[] args) {
        String s = "-1234";
        System.out.println(solution(s));
    }
}
