public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
    }

    public static boolean isPalindrome(String word) {
        char[] arr = word.toCharArray();
        int end = arr.length - 1;
        int start = 0;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}