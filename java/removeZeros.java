public class removeZeros {
    public static void sol(int[] nums) {
        int[] newArr = new int[nums.length];
        int currIndx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArr[currIndx] = nums[i];
                currIndx++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            nums[i] = newArr[i];
        }
    }
}
