package DataTypesInJava;
import java.util.Scanner;

public class DataTypes{

    public static void main (String args[]) {
        System.out.println("Hello, THis is my first Java Project on Gitpod");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Hello "+ name+ " Welcome to my Project");
        sc.close();
        
        /*
            Data Types in JAVA
            Primitive Data Types
        */
        //Integers
        byte byteValue = 127; //8-bit signed integer
        System.out.println("byte: " + byteValue);
        short shortValue = 32767; //16-bit signed integer
        System.out.println("short: " + shortValue);
        int intValue = 2147483647; //32-bit signed integer
        System.out.println("int: " + intValue);
        long longValue = 9223372036854775807L; //64-bit signed integer
        System.out.println("long: " + longValue);       
       
        //Floating-Points
        float floatValue = 3.14f; //32-bit floating-point
        System.out.println("float: " + floatValue);
        double doubleValue = 3.141592653589793; //64-bit floating-point
        System.out.println("double: " + doubleValue);
       
        //character
        char charValue = 'R'; // 16-bit Unicode character
        System.out.println("char: " + charValue);

        //boolean
        boolean booleanValue = true; //true or false
        System.out.println("boolean: " + booleanValue);

        /*
            Data Types in JAVA
            Reference Data Type (String)
        */
        String stringValue = "Hello, Java";
        System.out.println("String: " + stringValue);

    }
}