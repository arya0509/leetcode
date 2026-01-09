public class jumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums[nums.length - 1]; i >= 0; i--) {
            System.out.println(i);
            int val = nums[i];

            if (val + i >= goal) {
                goal = i;
            }
        }

        if (goal == 0) {
            return true;
        }
        return false;
    }
}
