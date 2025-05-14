
public class longestPalindrome {
    class Solution {
        public String longestPalindrome(String s) {
            if (s.isEmpty() || s.isBlank()) {
                return "";
            }
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                int len1 = expandFromCentre(s, i, i);
                int len2 = expandFromCentre(s, i, i + 1);
                int len = Math.max(len1, len2);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + (len) / 2;
                }
            }
            return s.substring(start, end + 1);
        }

        public int expandFromCentre(String word, int left, int right) {
            while ((left >= 0 && right < word.length()) && (word.charAt(right) == word.charAt(left))) {
                left--;
                right++;
            }
            return right - left - 1; // the last matched plaindrome was between (right-1) and (left+1). So, we
                                     // subtract that and get the answer
        }
    }

}
