import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(solution(new String[] { "abab", "aba", "" }));
    }

    public static String solution(String[] strs) {
        String commonPrefix = "";
        Arrays.sort(strs);

        char[] arr1 = strs[0].toCharArray();
        char[] arr2 = strs[strs.length - 1].toCharArray();

        int shortestLength = arr1.length < arr2.length ? arr1.length : arr2.length;

        for (int i = 0; i < shortestLength; i++) {
            if (arr1[i] != arr2[i]) {
                break;
            }
            commonPrefix += arr1[i];
        }
        return commonPrefix;
    }
}
