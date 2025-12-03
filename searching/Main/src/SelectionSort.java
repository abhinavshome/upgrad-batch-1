public class SelectionSort {
    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] arr) {
        final int SIZE = arr.length;

        for (int j = 0; j < SIZE; j++) {
            // Find the smallest and put it at start
            int minIndex = j;
            for (int i = j; i < SIZE; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
            printArray(arr);
        }

    }

    public static void main(String[] args) {
        int[] numbers = { 3, -4, 5, 34, 11, -29, 30 };
        printArray(numbers);
        selectionSort(numbers);
        printArray(numbers);
    }
}
