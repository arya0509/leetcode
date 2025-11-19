
public class maxProfit {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    public static int solution(int[] prices) {
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < prices.length) {
            if (prices[right] < prices[left]) {
                left = right;
            }
            if ((prices[right] - prices[left]) > max) {
                max = prices[right] - prices[left];
            }

            right++;

        }
        return max;
    }
}
