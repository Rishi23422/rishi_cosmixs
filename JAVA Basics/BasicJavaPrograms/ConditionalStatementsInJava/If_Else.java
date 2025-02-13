package ConditionalStatementsInJava;

import java.util.Scanner;

public class If_Else {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("The number is Positive.");
        }
        else if(num<0){
            System.out.println("The number is Negative.");
        }
        else{
            System.out.println("The number is zero.");
        }

        //Close the Scanner
         sc.close();

    }
    
}
