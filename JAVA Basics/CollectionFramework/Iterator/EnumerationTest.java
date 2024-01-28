package Iterator;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        Enumeration<String> enumeration = fruits.elements();
        while (enumeration.hasMoreElements()) {
            String fruit = enumeration.nextElement();
            System.out.println(fruit);
        }

        main1();
    }

    public static void main1(){
        Vector<Integer> v = new Vector<>();
        
        for(int i=0; i<10; i++){
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
           int i =  e.nextElement();
           System.out.print(i + " ");
        }
    }
}