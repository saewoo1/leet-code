package leetCode75.slidingwindow;

public class num1456 {
    public static int maxVowels(String s, int k) {
        int prefix = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                prefix++;
            }
        }

        int maxCount = prefix;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                prefix++;
            }
            if (isVowel(s.charAt(i - k))) {
                prefix--;
            }
            maxCount = Math.max(maxCount, prefix);
        }
        return maxCount;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s = "wellloveyou";
        int k = 7;
    }
}
