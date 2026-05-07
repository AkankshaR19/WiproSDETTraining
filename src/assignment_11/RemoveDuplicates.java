package assignment_11;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "banana";

        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
