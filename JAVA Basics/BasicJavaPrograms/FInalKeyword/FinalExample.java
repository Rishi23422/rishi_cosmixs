package FInalKeyword;

public class FinalExample {
    public static void main(String[] args) {
        final int constantValue = 10;
        final double PI = 3.14159;

        final String message;
        if (args.length > 0) {
            message = args[0];
        } else {
            message = "Default message";
        }

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println("Constant value: " + constantValue);
        System.out.println("PI value: " + PI);
        System.out.println("Message: " + message);
        System.out.println("StringBuilder value: " + sb.toString());
    }
}
