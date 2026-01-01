public class lengthOfLastWord {
    public int solution(String s) {

        char[] reversedCharArr = s.toCharArray();
        int count = 0;
        for (int i = reversedCharArr.length - 1; i >= 0; i--) {
            if (reversedCharArr[i] == ' ') {
                if (count == 0) {
                    continue;
                }
                return count;
            }
            count++;
        }

        return count;
    }
}
