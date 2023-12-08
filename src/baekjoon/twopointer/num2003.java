package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int target = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int pairCount = 0;
        while (true) {
            if (sum >= target) {
                pairCount++;
                sum = sum - arr[start++];
            } else if (end == n) {
                break;
            } else {
                sum = sum + arr[end++];
            }
            if (sum == target) {
                pairCount++;
            }
        }
    }
}
