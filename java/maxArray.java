public class maxArray {

    public static void main(String[] args) {
        System.out.println(sol(new int[] { 5, 4, -1, 7, 8 }));
    }

    public static int sol(int[] nums) {
        int max = nums[0];
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = (nums[i] > currSum) && currSum < 0 ? nums[i] : currSum + nums[i];
            if (currSum > 0 || currSum > max) {
                if (currSum > max) {
                    max = currSum;
                }
                continue;
            } else {
                currSum = 0;
            }
        }

        return max;

    }
}
