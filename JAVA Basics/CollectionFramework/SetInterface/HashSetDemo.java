package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> hash = new HashSet<String>();

        hash.add("Rishi");
        hash.add("Pal");
        hash.add("India");
        hash.add("Pune");
        hash.add("Kolkata");

        System.out.println(hash);

        hash.remove("Kolkata");
        System.out.println(hash);

        System.out.println("Is hash set contains Rishi: " + hash.contains("Rishi"));
        System.out.println("Is hash set contains Rishi1: " + hash.contains("Rishi1"));

        Iterator<String> itr = hash.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

       hash.clear();
       System.out.println(hash);
    }
}
