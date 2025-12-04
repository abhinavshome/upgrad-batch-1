import java.util.Arrays;

public class InsertionSort {
    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i ++) {
            printArray(arr);
            fixLastPositionInSortedArray(arr, i);
            printArray(arr);
            System.out.println("========");
        }

    }

    private static void fixLastPositionInSortedArray(int[] arr, int lastPosition) {
        int temp = arr[lastPosition];
        int j = lastPosition - 1;
        while(j >= 0) {
            if(arr[j] < temp) {
                break;
            }
            arr[j+1] = arr[j];
            j--;
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 3, -4, 5, 34, 11, -29, 30 };
        // printArray(numbers);
        insertionSort(numbers);
        // printArray(numbers);

        try {
            
            int[] case3 = { 2, 3, 5, 7, 9 };
            int[] expected3 = { 2, 3, 5, 7, 9 };
            fixLastPositionInSortedArray(case3, 4);
            assert Arrays.equals(case3, expected3) : "Test #3 failed!";

            int[] case2 = { 2, 3, 5, 7, 4 };
            int[] expected2 = { 2, 3, 4, 5, 7 };
            fixLastPositionInSortedArray(case2, 4);
            assert Arrays.equals(case2, expected2) : "Test #2 failed!";

            int[] case1 = { 2, 3, 5, 7, 1 };
            int[] expected1 = { 1, 2, 3, 5, 7 };
            fixLastPositionInSortedArray(case1, 4);
            assert Arrays.equals(case1, expected1) : "Test #1 failed!";
            
            System.out.println("All test passed");

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

    }
}
