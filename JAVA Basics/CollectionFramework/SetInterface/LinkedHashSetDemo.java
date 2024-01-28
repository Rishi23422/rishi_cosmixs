package SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Hyderabad");
        set.add("Bangalore");
        set.add("Chennai");

        System.out.println(set);
    }
}
