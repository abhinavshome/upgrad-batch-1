// [1,8,9,12,6]
// 1. I will assume that the first element is largest
// 2. I will go to each element and see if it is larger than the 
// largest number which I have seen till now.
// 3. If it is larger than what I saw already, I will take the new number
// to be the largest.




public class App {

    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for(int n: arr) {
            if(n > largest) {
                largest = n;
            }
        }

        return largest;
    }

    public static void main(String[] args) throws Exception {
        int[] ageOfStudents = {1,8,9,12,6};
        int[] bankBalanceOfCustomers = {-1,-8,-9,-12,-6};
        
        try {
            assert findLargest(ageOfStudents) == 12 : "Test #1 failed";
            assert findLargest(bankBalanceOfCustomers) == -1 : "Test #2 failed";
            System.out.println("All tests passed!");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}
