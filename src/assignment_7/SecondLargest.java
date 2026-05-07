package assignment_7;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Set<Integer> uniqueSet = new HashSet<>(numbers);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList);

        if (uniqueList.size() < 2) {
            System.out.println("Second largest element not available.");
        } else {
            System.out.println("Second largest element: " + 
                               uniqueList.get(uniqueList.size() - 2));
        }

        sc.close();
    }
}
