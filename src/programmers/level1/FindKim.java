package programmers.level1;

public class FindKim {
    public String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        int i;
        for (i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }
        return String.format(answer, i);
    }
}
