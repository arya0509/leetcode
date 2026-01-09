public class reverseWords {
    public static String reverseWords(String s) {
        String[] StringArray = s.split("\\s+");
        String output = "";
        for (int i = 0; i < StringArray.length; i++) {
            System.out.println(StringArray[i]);
        }
        for (int i = StringArray.length - 1; i >= 0; i--) {
            if (StringArray[i].isEmpty()) {
                continue;
            }
            if (i != StringArray.length - 1 && !output.isEmpty()) {
                output += " " + StringArray[i];
                continue;

            }
            output += StringArray[i];

        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
