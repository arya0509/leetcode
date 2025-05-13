
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int staticPointer = 0;
            int dynamicPointer = 0;
            while (true) {
                if (dynamicPointer == nums.length) {
                    dynamicPointer = 0;
                    staticPointer++;
                    continue;
                }
                if (nums[staticPointer] + nums[dynamicPointer] == target && staticPointer != dynamicPointer) {
                    break;
                }

                dynamicPointer++;

            }
            int smallerNum = staticPointer > dynamicPointer ? dynamicPointer : staticPointer;
            int largerNum = smallerNum == staticPointer ? dynamicPointer : staticPointer;
            int[] finalArray = { smallerNum, largerNum };

            return finalArray;

        }
    }
}