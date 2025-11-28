public class isSubSeq {
    public static boolean solution(String s, String t) {
        int subSeqIndx = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(subSeqIndx)) {
                if (subSeqIndx + 1 == s.length()) {
                    return true;
                }
                subSeqIndx++;
            }
        }
        return false;
    }

}
