// [-2, 0, 11, 22, 87, 94, 101, 121, 133, 156];

public class BinarySearch {

    public static int search(int[] arr, int num) {
        final int NOT_FOUND = -1;
        final int LEN = arr.length;
        int low = 0, high = LEN - 1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == num) {
                return mid;
            } else if(num > arr[mid]) {
                low = mid + 1;
            } else if(num < arr[mid]) {
                high = mid - 1;
            } 
        }
        

        return NOT_FOUND;
    }

    public static void main(String[] args) {
        System.out.println("-----------------------");
        
        try {
            int[] numbers = { -2, 0, 11, 22, 87, 94 };

            assert search(numbers, -2) == 0 : "Test # 1 failed";
            assert search(numbers, 87) == 4 : "Test # 2 failed";
            assert search(numbers, 95) == -1 : "Test # 3 failed";
            System.out.println("All tests passed!!");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}
