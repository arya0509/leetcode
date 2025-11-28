public class strStr {
    public static void main(String[] args) {
        System.out.println(solution("mississippi", "issip"));
    }

    public static int solution(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
