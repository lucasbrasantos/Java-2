package module6.lesson13;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    
    public static void main(String[] args) {
        Comparable[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Comparable eae = list[0];

        int res = binarySearch(list, 4);
        System.out.println("result is in index: " + res);
    }


    public static int binarySearch(Comparable[] list, Comparable target) {
        int start = 0, end = list.length - 1, mid = 0;
        int iteration = 1;
    
        System.out.println("Starting binary search for target: " + target);
        System.out.println("Initial array: " + Arrays.toString(list));
    
        while (start <= end) {
            mid = (start + end) / 2;
    
            // Create temp array of the current search range
            Comparable[] tempArray = Arrays.copyOfRange(list, start, end + 1);
    
            System.out.println("\nIteration " + iteration + ":");
            System.out.println("Start: " + start);
            System.out.println("End: " + end);
            System.out.println("Mid: " + mid);
            System.out.println("Current search range: " + Arrays.toString(tempArray));
            System.out.println("Comparing target " + target + " with element at mid: " + list[mid]);
    
            if (list[mid].compareTo(target) == 0) {
                System.out.println("Target found at index: " + mid);
                return mid;
            } else if (target.compareTo(list[mid]) < 0) {
                System.out.println("Target is smaller than mid element. Searching left half.");
                end = mid - 1;
            } else {
                System.out.println("Target is larger than mid element. Searching right half.");
                start = mid + 1;
            }
    
            iteration++;
        }
    
        System.out.println("\nTarget not found in the array.");
        return -1;
    }    

}