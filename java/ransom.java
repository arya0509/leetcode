
public class ransom {
    public static boolean solution(String ransomNote, String magazine) {
        char[] magArr = magazine.toCharArray();
        char[] ranArr = ransomNote.toCharArray();
        int[] counter = new int[26];

        for (char c : magArr) {
            counter[c - 'a']++;
        }

        for (char c : ranArr) {
            if (counter[c - 'a'] == 0) {
                return false;
            }
            counter[c - 'a']--;
        }

        return true;

    }
}
