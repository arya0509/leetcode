import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class removeDuplicate {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int actualIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])) {
                continue;
            }
            map.put(actualIndex, nums[i]);
            actualIndex++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(i)) {
                nums[i] = map.get(i);
            }
        }
        Set<Integer> set = map.keySet();
        return set.size();
    }
}
