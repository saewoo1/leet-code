package leetCode75.twopointer;

import java.util.Arrays;

public class MaxNumberOfKSumPairs1679 {
    /**
     * @param nums 숫자 배열
     * @param k    목표 합
     * @return 목표 합을 만드는 pair 개수
     * <p>
     * 숫자 배열 중, 목표 합을 만든 두 숫자를 지우고 반복해서 수행한다.
     */
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int pairCount = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == k) {
                pairCount++;
                start++;
                end--;
            } else if (nums[start] + nums[end] < k) {
                start++;
            } else
                end--;
        }
        return pairCount;
    }

    public static void main(String[] args) {

    }
}
