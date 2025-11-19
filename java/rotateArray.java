import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        solution(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
    }

    public static void solution(int[] nums, int k) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        if (nums.length != 1) {

            for (int i = 0; i < numsCopy.length; i++) {
                int currPos = i + k;

                while (currPos >= nums.length) {
                    currPos = currPos - nums.length;
                }

                nums[currPos] = numsCopy[i];
                print(nums);
            }
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }
}
