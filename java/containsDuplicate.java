import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        System.out.println(isDuplicate(new int[] { 1, 2, 3, 4 }));
    }

    public static boolean isDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length && nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
