public class BuubleSort {
    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        final int SIZE = arr.length;
        for (int j = 0; j < SIZE; j++) {

            // bubble it up once
            for (int i = 0; i < SIZE - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap elements at i and i+1
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            printArray(arr);
        }

    }

    public static void main(String[] args) {
        int[] numbers = { 3, -4, 5, 34, 11, -29, 30 };
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }
}
