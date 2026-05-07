package assignment_11;

import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1, 3};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
    }
}
