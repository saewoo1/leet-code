package programmers;

public class test2 {
    public int solution(int[] scoville, int K) {
        int i;
        int count = 0;
        for (i = 0; i <= scoville.length - 1; i++) {
            int first = Math.min(scoville[i], scoville[i + 1]);
            int second = Math.max(scoville[i], scoville[i + 1]);
            if (second >= K) {
                break;
            }
            scoville[i + 1] = first + second * 2;
            count++;
        }
        if (count == scoville.length - 1) {
            return -1;
        }
        return count;
    }
}
