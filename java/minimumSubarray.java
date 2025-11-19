
public class minimumSubarray {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int shortestLength = nums.length + 1;

        while (start <= end) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += nums[i];

                if (sum >= target && i - start + 1 < shortestLength) {
                    shortestLength = i - start + 1;

                    if (shortestLength == 1) {
                        return shortestLength;
                    }
                    start++;
                    break;
                }
            }
            if (end < nums.length) {

                end++;
            }
        }
        if (shortestLength == nums.length + 1) {
            return 0;
        }
        return shortestLength;

    }

}
