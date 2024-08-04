package module6.lesson13;

public class SortingMethods {
    
        public static int aa= 0;

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

            
            if (minIndex != unSortedStart) {
                nextSmallest = list[minIndex];
                list[minIndex] = list[unSortedStart];
                list[unSortedStart] = nextSmallest;
            }
            
        }

    }

    public static void mergeSort(int[] arr){

        /* 
         *        [2][4][7][1][6][3][8][5]
         *       [2][4][7][1]  [6][3][8][5]
         *     [2][4]  [7][1]  [6][3]  [8][5]
         *   [2]  [4]  [7]  [1]  [6]  [3]  [8]  [5]
         *      
        */

        int length = arr.length;
        if (length <=1 ) return; // base case
        
        int middle = length/2;
        int[] letfArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i < length; i++){
            if(i < middle){
                letfArr[i] = arr[i];
            }else{
                rightArr[j] = arr[i];
                j++;
            }
        }

        aa++;
        mergeSort(letfArr);
        mergeSort(rightArr);
        merge(arr, letfArr, rightArr);
         
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr){

        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging

        while(l < leftSize && r < rightSize){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            }else{
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while(r < rightSize){
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
    
    public static void printArr(int[] arr){

        System.out.print("\n");
        for (int i : arr) {
            System.out.printf("[ %d ] ", i);
        }
        System.out.print("\n");
    }

   

    public static void main(String[] args) {
        
        // String[] arr2 = {"eae", "cebola", "ca pim", "macarrao"};

        Integer[] arr = {2, 3, 4, 6, 1, 9, 8, 4, 6};
        int[] arr2 = {2, 3, 5, 6, 1, 9, 8, 4, 7};

        System.out.println(aa);
        printArr(arr2);
        mergeSort(arr2);
        printArr(arr2);
        System.out.println(aa);


        // printArr(arr);
        // selectionSort(arr);
        

    }
}
