package MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing elements from the TreeMap
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Value associated with key 2: " + treeMap.get(2));

        // Removing elements from the TreeMap
        treeMap.remove(1);

        // Display the updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);

        // Iterating over the TreeMap
        System.out.println("Iterating over the TreeMap:");
        for (Integer key : treeMap.keySet()) {
            String value = treeMap.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}
