package Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<10; i++){
            al.add(i);
        }
        System.out.println("Elements of ArrayList: " + al);

        ListIterator<Integer> li =  al.listIterator();
        while (li.hasNext()) {
            int i = (Integer) li.next();
            System.out.print(i + " ");

            if(i%2 == 0){
                i++;
                li.set(i);
                li.add(i);
            }
        }
        System.out.println();
        System.out.println("Elements after modification: " + al);
    }
}
