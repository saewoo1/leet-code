package baekjoon.twopointer.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int prefix = 0;
        for (int i = 0; i < k; i++) {
            prefix += arr[i];
        }

        int result = prefix;
        for (int i = k; i < n; i++) {
            prefix = prefix + arr[i] - arr[i - k];
            result = Math.max(result, prefix);
        }
        System.out.println(result);
    }
}
