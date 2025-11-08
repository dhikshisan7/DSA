package DAY9.HW.REMOVEDUPLICATES;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num); // automatically removes duplicates
        }

        System.out.print("Array after removing duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}

