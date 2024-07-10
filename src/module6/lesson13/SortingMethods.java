package module6.lesson13;

public class SortingMethods {
    

    public static void intSelectionSort(int[] list){

        int minIndex;
        int nextSmallest;

        for (int unSortedStart = 0; unSortedStart < list.length-1; unSortedStart++) {
            minIndex = unSortedStart;

            for (int currentIndex = unSortedStart+1; currentIndex < list.length; currentIndex++) {
                if (list[currentIndex] < list[minIndex]) {
                    minIndex = currentIndex;
                }                
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
            printArr(list);
        }

    }

    public static void selectionSort(Comparable[] list){

        int minIndex;
        Comparable nextSmallest;

            for (int unSortedStart = 0; unSortedStart < list.length-1; unSortedStart++) {
                minIndex = unSortedStart;

                for (int currentIndex = unSortedStart+1; currentIndex < list.length; currentIndex++) {
                    if (list[currentIndex].compareTo(list[minIndex]) < 0) {
                        minIndex = currentIndex;
                    }                
                }

                nextSmallest = list[minIndex];
                list[minIndex] = list[unSortedStart];
                list[unSortedStart] = nextSmallest;
                
            }

    }

    public static void mergeSort(){

        /* 
         *        [2][4][7][1][6][3][8][5]
         *       [2][4][7][1]  [6][3][8][5]
         *     [2][4]  [7][1]  [6][3]  [8][5]
         *   [2]  [4]  [7]  [1]  [6]  [3]  [8]  [5]
         *      
         */



    }

    
    public static void printArr(int[] arr){

        System.out.print("\n");
        for (int i : arr) {
            System.out.printf("[ %d ] ", i);
        }
        System.out.print("\n");
    }

   

    public static void main(String[] args) {
        
        int[] arr = {2, 4, 7 ,1, 6, 3, 8, 5};
        // String[] arr2 = {"eae", "cebola", "ca pim", "macarrao"};

        int[] arr2 = {2, 3, 4, 6, 1, 9, 8, 4, 6};



        printArr(arr);
        intSelectionSort(arr);
        

    }
}
