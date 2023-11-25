/**
 * @class:  ModifiedIntersectionExample
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Create an new ArrayList named intersection that contains
 * only those items that occur in both lists. If a value is duplicated in
 * either list and it occurs in both lists, it should only occur once in the intersection list.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ModifiedIntersectionExample {
    public static void main(String[] args) {
        // Given arrays
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        // Create an ArrayList to store the intersection
        ArrayList<Integer> modifiedIntersection = new ArrayList<>();

        // Create sets to handle duplicates and check for intersection
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements from list1 to set1 and modifiedIntersection
        for (int num : list1) {
            set1.add(num);
            modifiedIntersection.add(num);
        }

        // Add elements from list2 to set2 and check for intersection
        for (int num : list2) {
            set2.add(num);
            if (set1.contains(num)) {
                modifiedIntersection.add(num);
            }
        }

        // Print the modifiedIntersection ArrayList
        System.out.print("Modified Intersection: ");
        for (Integer num : modifiedIntersection) {
            System.out.print(num + " ");
        }
    }
}
