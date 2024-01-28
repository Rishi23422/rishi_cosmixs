package String;

public class StringExample {
    public static void main(String[] args) {
        // String declaration and initialization
        String str1 = "Hello";
        String str2 = new String("World");

        // String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated string: " + str3);

        // String length
        int length = str3.length();
        System.out.println("Length of the string: " + length);

        // String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // Substring
        String substring = str3.substring(6);
        System.out.println("Substring from index 6: " + substring);

        // Character extraction
        char firstChar = str1.charAt(0);
        System.out.println("First character of str1: " + firstChar);

        // String to integer conversion
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Parsed integer: " + number);

        // String to double conversion
        String doubleStr = "3.14";
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("Parsed double: " + doubleValue);

        // String splitting
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        System.out.println("Split words: ");
        for (String word : words) {
            System.out.println(word);
        }

        // String modification
        String modifiedStr = str1.replace('l', 'L');
        System.out.println("Modified string: " + modifiedStr);

        // String case conversion
        String lowercaseStr = "hello";
        String uppercaseStr = lowercaseStr.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseStr);
    }
}
