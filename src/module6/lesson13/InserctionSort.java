package module6.lesson13;

public class InserctionSort {
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4, 0, 9, 6, 7, 8};

        insertionSort2(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("\n");
        for (int i : arr) {
            System.out.printf("[ %d ] ", i);
        }
        System.out.print("\n");
    }

    public static void insertionSort(int[] arr) {

        for(int unSortedStart = 1; unSortedStart < arr.length; unSortedStart++) {
            int nextInsert = arr[unSortedStart]; // temp variable for the next value to be inserted
            int currentIndex = unSortedStart - 1;
            System.out.println("initial value: " + currentIndex);            

            while (currentIndex >= 0 && arr[currentIndex] > nextInsert) {
                arr[currentIndex+1] = arr[currentIndex];
                currentIndex--;
                System.out.println("after shifting: " + currentIndex);        
            }            
            
            System.out.println();
            arr[currentIndex+1] = nextInsert;

        }

    }

    public static void insertionSort2(int[] arr) {
    System.out.println("Original Array:");
    printArr(arr);
    
    for(int unSortedStart = 1; unSortedStart < arr.length; unSortedStart++) {
        int nextInsert = arr[unSortedStart]; // temp variable for the next value to be inserted
        System.out.println("\nCurrent Element to Insert: " + nextInsert);
        
        int currentIndex = unSortedStart - 1;
        System.out.println("Current Index: " + currentIndex);
        
        // Shift elements to the right to make space for nextInsert
        while (currentIndex >= 0 && arr[currentIndex] > nextInsert) {
            arr[currentIndex+1] = arr[currentIndex];
            currentIndex--;
            System.out.println("Shifting " + arr[currentIndex+1] + " to the right");
            printArr(arr);
        }
        
        // Insert nextInsert into its correct position
        arr[currentIndex+1] = nextInsert;
        System.out.println("Inserting " + nextInsert + " at index " + (currentIndex + 1));
        printArr(arr);
    }
    
    System.out.println("\nSorted Array:");
    printArr(arr);
}

}
