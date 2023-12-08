package leetCode75.arraystring;

public class MergeStringsAlternately {
    /**
     * word1, word2를 교차해서 문장완성
     * abc, pqr -> apbqcr
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
