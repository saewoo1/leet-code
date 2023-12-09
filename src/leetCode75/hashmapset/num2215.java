package leetCode75.hashmapset;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class num2215 {
    /**
     * @param nums1 수 배열
     * @param nums2 수 배열
     * @return Nums2에만 있는 수들, nums1에만 있는 수들
     */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new LinkedList<>();
        answer.add(findNotContains(nums1, nums2));
        answer.add(findNotContains(nums2, nums1));

        return answer;
    }

    private static List<Integer> findNotContains(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums2) {
            set.add(i);
        }
        HashSet<Integer> list = new HashSet<>();
        for (int i : nums1) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list.stream().toList();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
    }
}
