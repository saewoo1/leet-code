package leetCode75.twopointer;

public class MoveZeroes283 {

    /**
     * nums 내부의 0들을 맨 뒤로 미뤄라
     * -> nums 내부에 0이 아닌 수들을 앞으로 모두 땡기고,
     * 나머지 길이를 모두 0으로 채운다.
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int notZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZeroIndex] = nums[i];
                notZeroIndex++;
            }
        }
        while (notZeroIndex < nums.length) {
            nums[notZeroIndex] = 0;
            notZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] example = {0, 1, 0, 3, 12};
        moveZeroes(example);

        for (int i : example) {
            System.out.println("i = " + i);
        }
    }
}
