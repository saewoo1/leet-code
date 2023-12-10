package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문자열 내 마응대로 정렬하기
public class num1 {
    /**
     * @param strings 문자열
     * @param n       오름차순의 기준이 될 n 번째
     * @return n번째 문자로 재정렬한 후 반환
     */
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string.charAt(n) + string);
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}
