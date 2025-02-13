package ConditionalStatementsInJava;

import java.util.Scanner;

public class Switch_Case {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day of the week (1-7): ");
        int dayNumber = sc.nextInt();

        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid";
                break;
        }
        System.out.println("The day is : " + dayName);

        //Close the Scanner
        sc.close();
    }
}
