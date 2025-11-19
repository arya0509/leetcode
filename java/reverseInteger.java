public class reverseInteger {
    class Solution {
        public int reverse(int x) {
            char[] numArray = Integer.toString(x).toCharArray();
            String outputString = "";
            for (int i = numArray.length - 1; i > 0; i--) {
                outputString += numArray[i];
            }

            int finalValue = Integer.parseInt(outputString);
            double higherLimit = Math.pow(2, 32) - 1;
            double lowerLimit = Math.pow(-2, 32);

            if (finalValue > higherLimit || finalValue < lowerLimit) {
                return 0;
            }
            return finalValue;

        }
    }
}
