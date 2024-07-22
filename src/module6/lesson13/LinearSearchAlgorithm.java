package module6.lesson13;

import java.util.Random;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {

        int[] arr = generateRandomArray(200, 0, 1000);

        int find = 8;
        int res = linearSearch(arr, find);
        System.out.println("Found " + find + " at index " + res);
    }

    public static int linearSearch(int[] arr, int key) {
        
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int[] generateRandomArray(int length, int min, int max) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
