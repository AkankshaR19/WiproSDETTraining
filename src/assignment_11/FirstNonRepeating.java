package assignment_11;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "hello";

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No unique character found.");
    }
}