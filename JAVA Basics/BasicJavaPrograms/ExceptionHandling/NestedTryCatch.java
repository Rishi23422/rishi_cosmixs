package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                // Inner try block
                int[] numbers = { 1, 2, 3 };
                int result = numbers[5]; // ArrayIndexOutOfBoundsException
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: ArrayIndexOutOfBoundsException caught");
                throw new ArithmeticException("ArithmeticException occurred in inner catch block");
            } finally {
                System.out.println("Inner finally block executed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch block: ArithmeticException caught");
        } finally {
            System.out.println("Outer finally block executed");
        }
    }
}