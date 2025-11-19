public class removeElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5 };
        int k = removeElement(arr, 4);
        // System.out.println(k);
        // for (int i = 0; i < k; i++) {
        // System.out.println(arr[i]);
        // }
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        int a = 0;
        int b = nums.length - 1;
        while (b >= 0 && nums[b] == val) {

            b--;
        }
        for (int i = 0; i < nums.length; i++) {

            if (a == b || a > b) {

                break;
            } else if (nums[a] == val && b >= 0) {

                nums[a] = nums[b];
                nums[b] = val;
                b--;
                while (b != a && nums[b] == val) {

                    b--;
                }

            }
            a++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            }
        }
        System.out.println(k);
        return k;

    }
}
