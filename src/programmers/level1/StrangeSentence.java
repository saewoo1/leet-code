package programmers.level1;

public class StrangeSentence {
    /**
     * @param s 한 개 이상의 단어로 구성, 공백 문자로 구분
     *          각 단어의 짝수번째 알파벳 -> 대문자
     *          홀수번째 알파벳 -> 소문자
     * @return 변경된 문자열
     */
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split("");

        int idx = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(" ")) {
                idx = 0;
                answer.append(" ");
            }
            if (idx % 2 == 0) {
                answer.append(words[i].toUpperCase());
                idx++;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
