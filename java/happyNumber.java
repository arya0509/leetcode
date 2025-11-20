import java.util.HashSet;

public class happyNumber {
    public static boolean solution(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;

    }

    public static int square(int num) {
        // ans is the final output here.
        int ans = 0;
        // This ensures that all the digits have been pointed to
        while (num > 0) {
            // First step is the get the last digit
            int remainder = num % 10;
            // Adding the square of the last digit to the output
            ans += Math.pow(remainder, 2);
            // Reducing one more digit from the last so we can point to the next digit
            num /= 10;

        }
        return ans;

    }
}
