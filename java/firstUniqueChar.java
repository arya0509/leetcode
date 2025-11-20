import java.util.HashMap;
import java.util.Map;

public class firstUniqueChar {
    public static int solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(i) + 1);
                continue;
            }
            map.put(arr[i], 0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
}
