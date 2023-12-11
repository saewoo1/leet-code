package programmers.level1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Running {
    /**
     * @param players  선수 명단
     * @param callings 불린 선수들
     * @return 불릴 때마다 앞의 선수를 제친다.
     */
    public static String[] solution(String[] players, String[] callings) { // 시간 초과
        String[] answer = new String[players.length];

        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (players[j].equals(callings[i])) {
                    String tmp = players[j];
                    players[j] = players[j - 1];
                    players[j - 1] = tmp;
                }
            }
        }
        return players;
    }

    public static String[] solution2(String[] players, String[] callings) {
        Map<String, Integer> runners = new LinkedHashMap<>();
        for (int i = 0; i < players.length; i++) {
            runners.put(players[i], i);
        }

        for (String calling : callings) {
            int rank = runners.get(calling); // 불린 사람의 현재 등수

            String prevRunner = players[rank - 1]; // 원래 앞사람
            runners.replace(prevRunner, rank); // 뒤로 밀림
            players[rank] = prevRunner;

            runners.replace(calling, rank - 1); // 이름 불린 사람 앞으로 전진
            players[rank - 1] = calling;
        }

        return players;
    }


    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        String[] answer = solution2(players, callings);
        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}
