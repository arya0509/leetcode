import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);

            List<List<Integer>> output = new ArrayList<List<Integer>>();
            for (int i = 0; i < nums.length - 2; i++) {
                int small = i;
                int medium = i + 1;
                int large = nums.length - 1;
                if (i != 0 && nums[small] == nums[small - 1]) {
                    continue;
                }
                while (medium < large) {

                    int sum = nums[small] + nums[medium] + nums[large];
                    if (sum < 0) {
                        medium++;

                    } else if (sum > 0) {
                        large--;
                    } else {

                        output.add(new ArrayList<>(List.of(nums[small], nums[medium], nums[large])));
                        medium++;
                        large--;
                        while (nums[medium] == nums[medium - 1] && medium < large) {
                            medium++;
                        }
                        while (nums[large] == nums[large + 1] && medium < large) {
                            large--;
                        }
                    }

                }
            }

            return output;

        }
    }

    public static void main(String[] args) {
        int[] input = { 2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10 };
        ThreeSum threeSum = new ThreeSum();
        Solution sol = threeSum.new Solution();
        System.out.println(sol.threeSum(input));
    }
}
