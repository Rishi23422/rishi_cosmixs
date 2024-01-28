package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // Division by zero exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            // Array index out of bounds exception
            int[] numbers = { 1, 2, 3 };
            int value = numbers[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            // Number format exception
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        try {
            // Custom exception
            throw new CustomException("Custom exception occurred");
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
