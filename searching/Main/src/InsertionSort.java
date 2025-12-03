public class InsertionSort {
    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int selectMinIndex(int[] arr, int startingPoint) {
        int minIndex = startingPoint;
        for (int i = startingPoint; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // i+1 is the first element from unsorted part
            int j, current = arr[i+1];
            for(j = i; j >= 0; j--) {
                if(arr[i+1] < arr[j]) arr[j+1] = arr[j];
                else break;
            }
            System.out.println("j = " + j);
            arr[j+1] = current;
            System.out.println(current);
            System.out.println(i);
            printArray(arr);
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 3, -4, 5, 34, 11, -29, 30 };
        printArray(numbers);
        insertionSort(numbers);
        printArray(numbers);
    }
}
