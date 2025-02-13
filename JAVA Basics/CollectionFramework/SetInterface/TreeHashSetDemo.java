package SetInterface;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeHashSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<Integer>();

        tset.add(15);
        tset.add(12);
        tset.add(14);
        tset.add(13);
        tset.add(12);
        tset.add(12345);

        System.out.println(tset);

        tset.remove(12345);
        System.out.println("After remove Operation: " +tset);
        System.out.println("Set contains 12 ?  " +tset.contains(12));
        System.out.println("First element of tree set is: " +tset.first());
        System.out.println("Last element of tree set is: " +tset.last());
        System.out.println("Use of Headset: " +tset.headSet(14));
        System.out.println("Use of Tailset: " +tset.tailSet(13));
        System.out.println("Use of Subset: " +tset.subSet(12, 15));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(55);
        list.add(56);
        list.add(56);
        list.add(56);
        System.out.println("Array List is: " + list);

        TreeSet<Integer> tset1 = new TreeSet<Integer>(list);
        System.out.println(tset1.size());
    
    }
}
