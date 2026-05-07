package assignment_11;

import java.util.*;

public class SortMapByKeys {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        Map<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("Map sorted by keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}