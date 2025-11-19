public class isPalindrome {
    public static void main(String[] args) {
        Solution("A man, a plan, a canal: Panama");
    }

    public static boolean Solution(String s) {
        char[] arr = s.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(arr[start])) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(arr[end])) {
                end--;
                continue;
            }
            if (Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
