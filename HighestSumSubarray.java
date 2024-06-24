import java.util.Scanner;

public class HighestSumSubarray{

    public static int[] findHighestSumSubarray(int[] arr) {
        int n = arr.length;

        // Initialize the maximum sum and the subarray start and end indexes
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        // Iterate over all subarrays of the given array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Calculate the sum of the current subarray
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                // Update the maximum sum if the current sum is greater
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        // Return the subarray with the highest sum
        return Arrays.copyOfRange(arr, start, end + 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read the input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();

        // Create an array to store the input
        int[] arr = new int[n];

        // Read the elements of the array from the user
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the subarray with the highest sum
        int[] highestSumSubarray = findHighestSumSubarray(arr);

        // Print the subarray
        System.out.println("The subarray with the highest sum is: " + Arrays.toString(highestSumSubarray));
    }
}
