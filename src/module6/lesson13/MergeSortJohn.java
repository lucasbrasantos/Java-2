package module6.lesson13;

public class MergeSortJohn {
    


    public static void main(String[] args) {
        
        // mergeSort(inputArr);
        int[] inputArr = {2, 3, 5, 6, 1, 9, 8, 4, 7};

        System.out.println("\n\n==--==-- MERGE SORT --==--==\n");
        System.out.print("Array: ");
        printArr(inputArr);

        mergeSort(inputArr);
        

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

        // line();
        System.out.print("left half: ");
        printArr(leftHalf);

        System.out.print("right half: ");
        printArr(rightHalf);
        line();

        mergeSort(leftHalf);
        mergeSort(rightHalf);
    }

    private static void merge(int[] inputArr, int[] leftHalf, int[] rightHalf) {
        // Arrays Lengths
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
    }
}
