package programmers;

import java.util.Arrays;

public class Knums {
    public static int[] solutions(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;
        for (int i = 0; i < commands.length; i++) {
            int k = 0;
            int[] list = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list[k++] = array[j - 1];
            }
            Arrays.sort(list);
            answer[n++] = list[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    }
}
