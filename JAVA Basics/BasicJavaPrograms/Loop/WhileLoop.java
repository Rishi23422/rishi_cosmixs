package Loop;

public class WhileLoop {

    public static void main(String[] args) {
        
        rightAngledTriangle();
        pyramid();
        diamond();
        hollowRectangle();
    }

    public static void rightAngledTriangle(){
        int rows = 5;
        int i = 1;

        while (i<= rows) {
            int j = 1;
            while (j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------");
    }

    public static void pyramid(){
        int rows = 5;
        int i =0;
        while (i<rows) {
            int spaces = rows-i;
            while (spaces > 1) {
                System.out.print(" ");
                spaces--;
            }
            int j=0;
            while (j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------");
    }

    public static void diamond(){
        int rows = 5;
        int i= 0;
        while (i<rows) {
            int spaces = rows-i;
            while (spaces>1) {
                System.out.print(" ");
                spaces--;
            }
            int j=0;
            while (j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = rows-1;
        while (i>0) {
            int spaces = 0;
            while (spaces < rows-i) {
                System.out.print(" ");
                spaces++;
            }
            int j=0;
            while (j<i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println("--------");
    }

    public static void hollowRectangle(){
        int rows = 4;
        int columns = 6;
        int i = 1;
        while (i<=rows) {
            int j=1;
            while (j<=columns) {
                if (i==1 || i==rows || j==1 || j==columns) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------");
    }
    
}
