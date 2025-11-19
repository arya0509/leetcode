public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1, };
        merge(nums1, 1, nums2, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        int b = 0;
        int endcount = 0;
        int[] finalArray = new int[m + n];
        if (m == 0) {
            finalArray = nums2;

        } else if (n == 0) {
            finalArray = nums1;
        } else {
            while (endcount < (m + n)) {
                if (a >= m) {
                    finalArray[endcount] = nums2[b];
                    b++;
                    endcount++;
                    continue;
                } else if (b >= n) {
                    finalArray[endcount] = nums1[a];
                    a++;
                    endcount++;
                    continue;
                }

                else if (nums1[a] <= nums2[b]) {
                    finalArray[endcount] = nums1[a];
                    a++;
                } else {
                    finalArray[endcount] = nums2[b];

                    b++;
                }
                endcount++;
            }
            nums1 = finalArray;

        }
        nums1 = finalArray;
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = finalArray[i];
            System.out.println(nums1[i]);
        }
    }
}
