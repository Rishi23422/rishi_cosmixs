package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    
    public static void main(String[] args) {

       List<Integer> l1 = new ArrayList<Integer>();
       l1.add(0,25);
       l1.add(1, 35);
       l1.add(2, 45);

       System.out.print("Elements in first List: " + l1);
       System.out.println();

       List<Integer> l2 = new ArrayList<Integer>();
       l2.add(0,55);
       l2.add(1, 65);
       l2.add(2, 75);

       System.out.print("Elements in second List: " + l2);
       System.out.println();

       l1.addAll(3, l2);
       System.out.print("Elements in first List after addAll Operation: " + l1);
       System.out.println();

       l1.remove(5);
       System.out.print("Elements in first List after remove Operation: " + l1);

       System.out.println("Print individual elements of List");
       for(int i=0; i<l1.size(); i++){
        System.out.println(l1.get(i));
       }
       System.out.println();

       l1.set(4, 66);
       System.out.print("Elements in first List after Set Operation: " + l1);
       System.out.println();

       System.out.println("Index of 55: " + l1.indexOf(55));

       System.out.println("sublist: " + l1.subList(0, 3) );
    }
}
