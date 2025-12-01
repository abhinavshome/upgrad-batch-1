// [90, -12, 88, 9, 23];

public class LinearSearch {
    public static String arrToString(int[] arr) {
        String res = "";
        for(int e: arr) {
            res += (e + ", ");
        }
        return res;
    }

    public static int search(int[] arr, int num) {
        System.out.println("-----------------------");
        System.out.println("Going to search " + num + " inside " + arrToString(arr));
        final int NOT_FOUND = -1;
        final int LEN = arr.length;

        for (int i = 0; i < LEN; i++) {
            System.out.println("--------");
            System.out.println("index: " + i);
            System.out.println("array element: " + arr[i]);
            System.out.println("if it will go inside if block: " + (arr[i] == num));
            if(arr[i] == num) {
                return i;
            }
        }

        return NOT_FOUND;
    }

    public static void main(String[] args) {
        System.out.println("-----------------------");
        
        try {
            int[] numbers = { 2, 12, 99, 0, 11, -2 };

            assert search(numbers, 12) == 1 : "Test # 1 failed";
            assert search(numbers, 23) == -1 : "Test # 2 failed";
            assert search(numbers, 11) == 4 : "Test # 3 failed";
            System.out.println("All tests passed!!");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}
