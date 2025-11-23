
public class isIsomorphic {
    public static boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arrS = new int[26];
        int[] arrT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (arrS[s.charAt(i) - 'a'] != arrT[t.charAt(i) - 'a']) {
                return false;
            }
            arrS[s.charAt(i) - 'a'] = i;
            arrT[t.charAt(i) - 'a'] = i;
        }

        return true;
    }
}
