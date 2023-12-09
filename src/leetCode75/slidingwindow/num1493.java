package leetCode75.slidingwindow;

public class num1493 {
    /**
     * @param nums 1, 0으로 이루어진 수 배열
     * @return 하나를 1로 변경한 뒤 가장 긴 1의 개수
     */
    public static int longestSubarray(int[] nums) {
        int start = 0;
        int zeroCount = 0;
        int len = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            System.out.println("start = " + start);
            System.out.println("end = " + end);
            len = Math.max(len, end - start);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};

        System.out.println(longestSubarray(nums));
    }
}
