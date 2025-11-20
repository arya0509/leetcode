import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class intersectionOfArrays {
    public static int[] solution(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 0);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                if (map.get(nums2[i]) == 0) {
                    output.add(nums2[i]);
                    map.put(i, 1);
                }
            }
        }

        int[] finalOutput = new int[output.size()];

        for (int i = 0; i < finalOutput.length; i++) {
            finalOutput[i] = output.get(i);
        }

        return finalOutput;

    }
}