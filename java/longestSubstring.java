
public class longestSubstring {

    static class Solution {

        public int lengthOfLongestSubstring(String s) {
            int length = s.length();
            int maxLength = 0;
            int[] lastIndexValue = new int[128];

            for (int start = 0, end = 0; end < length; end++) {
                char character = s.charAt(end);
                start = Math.max(start, lastIndexValue[character]);
                maxLength = Math.max(maxLength, end - start + 1);
                lastIndexValue[character] = end + 1;
            }

            return maxLength;
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("ohomm"));
    }
}
