package Loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        rightAngledTriangle();
        pyramid();
    }

    public static void rightAngledTriangle(){
        int rows = 5;
        int i = 1;

        do{
            int j=1;
            do{
                System.out.print("* ");
                j++;
            }
            while(j<=i);
            System.out.println();
            i++;
        }while(i<= rows);
        System.out.println("------------------");
    }

    public static void pyramid(){
        int rows = 5;
        int i =0;
         do{
            int spaces =rows-i;
            do{
                System.out.print(" ");
                spaces--;
            }
            while(spaces > 1);

            int j=0;
            do{
                System.out.print("* ");
                j++;
            }
            while (j<=i);
            System.out.println();
            i++;
         }
         while(i<rows);
         System.out.println("------------------");
    }
    
}
