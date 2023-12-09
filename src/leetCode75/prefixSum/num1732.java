package leetCode75.prefixSum;

import java.util.Arrays;

public class num1732 {
    /**
     * @param gain 각각의 높이들
     * @return 0부터 시작해서 idx i까지 모든 수를 더하고, 그중 가장 큰 수를 반환하라.
     */
    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        int sum = 0;
        altitudes[0] = sum;
        for (int i = 1; i < altitudes.length; i++) {
            sum += gain[i - 1];
            altitudes[i] = sum;
            System.out.println("altitudes[i] = " + altitudes[i]);
        }
        return Arrays.stream(altitudes).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] altitudes = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(altitudes));
    }
}
