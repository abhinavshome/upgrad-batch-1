public class NextLarger {

    public static void printArray(int[] arr) {
        for(int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static int findIndex(int n, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(n == arr[i]) return i;
        }

        return -1;
    }

    public static int[] nextLarger(int[] arr1, int[] arr2) {
        final int SIZE = arr1.length;
        int[] result1 = new int[arr1.length];
        int[] result2 = new int[arr2.length];

        for(int i = 0; i < SIZE; i++) {
            int curr = arr1[i];
            for(int j = i + 1; j < SIZE; j++) {
                if(arr1[j] > curr) {
                    result1[i] = arr1[j];
                    break;
                }
            }
            if(result1[i] == 0) result1[i] = -1;
        }

        for(int i = 0; i < arr2.length; i++) {
            int index = findIndex(arr2[i], arr1);
            result2[i] = result1[index];
        }
                
        return result2;
    }

    public static void main(String[] args) {
        int[] num1 = {4,7,1,3,11,5};
        int[] num2 = {4,3,5};
        int[] res = nextLarger(num1, num2);
        printArray(res);

        // [7, 11, 3, 11, -1, -1];


    }
}
