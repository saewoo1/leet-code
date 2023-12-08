package baekjoon.twopointer.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken()); // 배열 총 길이
        int m = Integer.parseInt(tokenizer.nextToken()); // 타겟

        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int start = 0, end = 0;
        int sum = 0;
        int matchCount = 0;
        while (end <= n) {
            if (sum < m) {
                sum += arr[end];
                end++;
            } else if (sum > m) {
                sum -= arr[start];
                start++;
            } else {
                matchCount++;
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(matchCount);
    }
}
