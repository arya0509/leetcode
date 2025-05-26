import java.util.ArrayList;

public class ZigZagConversion {
    class Solution {
        public static String convert(String s, int numRows) {
            ArrayList<ArrayList<Character>> result = new ArrayList<ArrayList<Character>>();
            for (int i = 0; i < numRows; i++) {
                result.add(new ArrayList<Character>());
            }
            int pointer = 0;
            String output = "";
            for (int i = 0; i < s.length(); i++, pointer++) {
                result.get(pointer).add(s.charAt(i));
                if (pointer == numRows - 1 && pointer < s.length() - 1) {
                    int elem = i + 1;
                    for (int j = pointer - 1; j > 0; j--, elem++) {
                        if (elem == s.length()) {
                            break;
                        }
                        result.get(j).add(s.charAt(elem));

                    }
                    i = --elem;

                    pointer = -1;

                }

            }

            for (int i = 0; i < numRows; i++) {
                for (char charact : result.get(i)) {
                    output += charact;
                }
            }

            return output;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.convert("ABCDE", 4));
    }
}