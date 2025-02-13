package MapInterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Rishi", 25);
        hmap.put("Harshda", 26);
        hmap.put("Padmalaya", 25);
        hmap.put("Shashank", 24);
        hmap.put("Piyush", 23);
        System.out.println(hmap);
        
        if(hmap.containsKey("Harshda")){
            System.out.println("Age of Harshda: " + hmap.get("Harshda"));
        }

        System.out.println("Size of HashMap is: " + hmap.size());
        System.out.println("Is HashMap empty? " + hmap.isEmpty());

        hmap.clear();
        System.out.println("Is HashMap empty after clear Operation? " + hmap.isEmpty());

    }
}
