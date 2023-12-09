package leetCode75.prefixSum;

import java.util.Arrays;

public class num724 {
    public static int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
