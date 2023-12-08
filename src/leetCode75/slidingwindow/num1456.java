package leetCode75.slidingwindow;

import java.util.HashSet;

public class num1456 {
    /**
     * @param s 주어진 string
     * @param k slidingWindow 길이
     * @return 모음이 가장 많이 포함된 개수
     */
    public static int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int prefix = 0;
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                prefix++;
            }
        }

        int matchCount = prefix;
        for (int i = k; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                prefix++;
            }
            if (set.contains(s.charAt(i - k))) {
                prefix--;
            }
            matchCount = Math.max(matchCount, prefix);
        }
        return matchCount;
    }

    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;
        System.out.println(maxVowels(s, k));
    }
}
