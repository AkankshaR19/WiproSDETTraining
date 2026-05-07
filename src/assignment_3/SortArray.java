package assignment_3;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr);
        System.out.println("Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Descending Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
