package leetCode75.slidingwindow;

public class num1004 {
    /**
     * @param nums 1, 0이 섞여 있는 배열
     * @param k    총 k개까지 1로 변경할 수 있다.
     * @return 연속적으로 가장 긴 1의 길이
     */
    public static int longestOnes(int[] nums, int k) {
        int len = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[start] == 0) {
                    k++;
                }
                start++;
            }
            if (k >= 0) {
                len = Math.max(len, end - start + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }
}
