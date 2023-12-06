package leetCode75.twopointer;

/**
 * s, t가 주어질 때
 * s가 t 내부에 포함되는 문자로 이루어져 있는지 검증하라.
 * 순서도 고려해야됨;;
 */
public class IsSubsequence392 {

    public boolean isSubsequence(String s, String t) {
        /**
         * "acb"
         * "ahbgdc"
         *
         * sChar를 tChar 내부에서 찾은 위치를 기억하고,
         * 다음 검색은 여기부터 해야될듯..
         */

        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length() && sIndex < s.length(); tIndex++) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
        }

        return sIndex == s.length();
    }

    public static void main(String[] args) {

    }
}
