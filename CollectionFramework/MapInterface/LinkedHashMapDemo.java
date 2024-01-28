package MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<String, Integer>();

        lhmap.put("Rishi", 25);
        lhmap.put("Harshda", 26);
        lhmap.put("Padmalaya", 25);
        lhmap.put("Shashank", 24);
        lhmap.put("Piyush", 23);
        System.out.println(lhmap);

        lhmap.putIfAbsent("Rishi", 25);
        System.out.println(lhmap);

        System.out.println("Size of LinkedHashMap is: " + lhmap.size());
        System.out.println("Is LinkedHashMap empty? " + lhmap.isEmpty());
        System.out.println("Is LinkedHashMap contains Harshda: " + lhmap.containsKey("Harshda"));
        System.out.println("Is LinkedHashMap contains 35: " + lhmap.containsValue(35));

    }
}
