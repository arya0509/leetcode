import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class phoneNumberCombination {
    public class Solution {
        List<String> letterCombinations(String digits) {

            HashMap<Character, String> phoneMap = new HashMap<Character, String>();
            phoneMap.put('2', "abc");
            phoneMap.put('3', "def");
            phoneMap.put('4', "ghi");
            phoneMap.put('5', "jkl");
            phoneMap.put('6', "mno");
            phoneMap.put('7', "pqrs");
            phoneMap.put('8', "tuv");
            phoneMap.put('9', "wxyz");

            ArrayList<String> result = new ArrayList<String>();
            if (digits.length() == 0) {
                return result;
            }

            int index = 0;
            backTrack(result, index, new StringBuilder(), digits, phoneMap);
            return result;
        }

        void backTrack(ArrayList<String> result, int index, StringBuilder current, String digits,
                HashMap<Character, String> phoneMap) {
            if (index == digits.length()) {
                result.add(current.toString());
                return;
            }

            String currDigit = phoneMap.get(digits.charAt(index));
            for (char c : currDigit.toCharArray()) {
                current.append(c);
                backTrack(result, index + 1, current, digits, phoneMap);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        phoneNumberCombination pnc = new phoneNumberCombination();
        phoneNumberCombination.Solution sol = pnc.new Solution();
        System.out.println(sol.letterCombinations("234"));
    }
}
