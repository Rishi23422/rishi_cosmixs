package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
         for(int i =0; i<10; i++){
            al.add(i);
         }
        System.out.println("Elements of ArrayList: " + al);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            int i = (Integer) itr.next();

            System.out.print(i + " ");

            //Remove odd elements
             if (i%2 != 0) {
                itr.remove();
             }
        }
        System.out.println("Elements of ArrayList after remove: " + al);        

    }
}
