package Loop;

public class ForLoop {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        rightAngledTriangle();
        pyramid();
        diamond();
        hollowRectangle();
    }

    public static void rightAngledTriangle(){
        int rows = 5;
        for(int i=1; i<=rows ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public static void pyramid(){
        int rows = 5;
        for(int i=0; i<rows ; i++){
            for(int j=rows-i; j>1 ; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public static void diamond(){
        int rows = 5;
        for(int i=0; i<rows ; i++){
            for(int j=rows-i; j>1 ; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows-1; i>0; i--){
            for(int j=0; j< rows-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public static void hollowRectangle(){
        int rows = 4;
        int columns = 6;
        for(int i=1; i<=rows ; i++){
            for(int j=1; j<=columns; j++){
                if(i==1 || i==rows || j==1 ||j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("--------");
    }
}
