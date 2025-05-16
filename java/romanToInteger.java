import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    class Solution {

        public int romanToInt(String s) {
            int num = 0;
            Map<String, Integer> nums = new HashMap<>();
            nums.put("I", 1);
            nums.put("IV", 4);
            nums.put("V", 5);
            nums.put("IX", 9);
            nums.put("X", 10);
            nums.put("XL", 40);
            nums.put("L", 50);
            nums.put("XC", 90);
            nums.put("C", 100);
            nums.put("CD", 400);
            nums.put("D", 500);
            nums.put("CM", 900);
            nums.put("M", 1000);
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 != s.length()
                        && nums.get(String.valueOf(s.charAt(i + 1))) > nums.get(String.valueOf(s.charAt(i)))) {
                    num += nums.get(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)));
                    i++;
                    continue;
                }
                num += nums.get(String.valueOf(s.charAt(i)));
            }
            return num;
        }
    }
}
