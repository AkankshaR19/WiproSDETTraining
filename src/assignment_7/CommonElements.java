package assignment_7;
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.print("Enter size of first set: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.print("Enter size of second set: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);

        System.out.println("Common elements: " + result);

        sc.close();
    }
}