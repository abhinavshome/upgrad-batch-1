import java.util.Stack;

public class NextLargerUsingStack {

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
        Stack<Integer> S = new Stack<Integer>();

        for(int i = SIZE - 1; i >= 0; i--) {
            while(!S.isEmpty() && S.getLast() < arr1[i]) {
                S.pop();
            }

            if(S.isEmpty()) {
                result1[i] = -1;
            } else {
                result1[i] = S.lastElement();
            }

            S.push(arr1[i]);
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
