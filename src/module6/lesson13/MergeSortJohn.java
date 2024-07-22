package module6.lesson13;

import java.util.Random;

public class MergeSortJohn {
    


    public static void main(String[] args) {
        
        // mergeSort(inputArr);
        int[] inputArr = {2, 3, 5, 6, 1, 9, 8, 4, 7};
        int[] numbers = new int[1000];
        Random rand = new Random();

        long startTime = System.nanoTime();
        long startTime2 = System.nanoTime();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000000);
        }

        numbers[2] = 999999999;
        numbers[3] = 989898989;
        numbers[20] = 2;
        long endTime2 = System.nanoTime();

        System.out.println("\n\n==--==-- MERGE SORT --==--==\n");
        
        
        printArr(inputArr);
        mergeSort(inputArr);
        printArr(inputArr);
        
        // // printArr2(numbers);
        // mergeSort(numbers);
        // printArr2(numbers);
        long endTime = System.nanoTime();

        
        long totalTime = endTime - startTime;
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Total time: " + totalTime / 1000000 + " milliseconds");
        System.out.println("Total time: " + totalTime / 1000000000 + " seconds");
        line();
        System.out.println("Total time: " + totalTime2 / 1000000 + " milliseconds");

    }

    public static void line(){
        System.out.println("\n//--==---==---==---==---//\n");
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if(arr.length < 2){
                System.out.printf("[ %d ]\n", arr[i]);
            }else if (i == 0) {
                System.out.printf("[ %d, ", arr[i]);
            }else if (i == arr.length - 1) {
                System.out.printf("%d ]\n", arr[i]);
            }else{
                System.out.printf("%d, ", arr[i]);
            }
        }
        System.out.println();

    }
 
    public static void printArr2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if(arr.length < 2){
                System.out.printf("[ %d ]\n", arr[i]);
            }else if (i == 0) {
                System.out.printf("[\n    %d,\n", arr[i]);
            }else if (i == arr.length - 1) {
                System.out.printf("    %d\n]\n", arr[i]);
            }else{
                System.out.printf("    %d,\n", arr[i]);
            }
        }
        System.out.println();

    }

    private static void mergeSort(int[] inputArr) {
     
        int inputLength = inputArr.length;
        if (inputLength < 2) return;

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArr[i];
        }

        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = inputArr[i + midIndex];
        }

        System.out.print("left half: ");
        printArr(leftHalf);

        System.out.print("right half: ");
        printArr(rightHalf);
        line();

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArr, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArr, int[] leftHalf, int[] rightHalf) {
        // Arrays Lengths
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int m = 0, l = 0, r = 0;
        // m = merge, l = left, r = right;

        while(l < leftSize && r < rightSize){
            if (leftHalf[l] <= rightHalf[r]) {
                inputArr[m] = leftHalf[l];
                l++;
            }else{
                inputArr[m] = rightHalf[r];
                r++;
            }
            m++;
        }

        while (l < leftSize) {
            inputArr[m] = leftHalf[l];
            l++;
            m++;
        }

        while(r < rightSize){
            inputArr[m] = rightHalf[r];
            r++;
            m++;
        }


        
    }
}
