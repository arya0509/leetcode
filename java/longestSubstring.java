import java.util.ArrayList;

public class longestSubstring {

    static class Solution {
        int len = 0;

        public int lengthOfLongestSubstring(String s) {
            if (s.equals("")) {
                return 0;
            }
            if (s.length() == 1) {
                return 1;
            }
            char[] orignalStringArray = s.toCharArray();
            ArrayList<String> possibleSubstrings = new ArrayList<String>();

            String subString = "";

            for (int i = 0; i < orignalStringArray.length; i++) {
                if (presentInSubstring(orignalStringArray[i], subString)) {
                    possibleSubstrings.add(subString);

                    subString = (len == subString.length() ? ""
                            : subString.substring(len, subString.length())) + orignalStringArray[i];

                    continue;
                }
                subString += orignalStringArray[i];
                int index = i;
                if (++index == orignalStringArray.length) {
                    possibleSubstrings.add(subString);

                }
            }

            possibleSubstrings.sort((a, b) -> Integer.compare(b.length(), a.length()));

            int longestSubstring = possibleSubstrings.get(0).length();
            return longestSubstring;
        }

        boolean presentInSubstring(char letter, String currSubstring) {
            char[] StringArray = currSubstring.toCharArray();
            len = 1;
            for (char charact : StringArray) {
                if (charact == letter) {
                    return true;
                }
                len++;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("ohomm"));
    }
}
