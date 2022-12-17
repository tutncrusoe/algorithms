import java.util.Arrays;

public class BubbleSort {

    /*
    Optimized Implementation of Bubble Sort:
    The above function always runs O(N2) time even if the array is sorted.
    It can be optimized by stopping the algorithm if the inner loop didn’t cause any swap.

    Time Complexity: O(N2)
    Auxiliary Space: O(1)
     */
    public static int[] bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int[] swap = swap(nums[j], nums[j + 1]);
                    nums[j] = swap[0];
                    nums[j + 1] = swap[1];
                    swapped = true;
                }
                printArray(nums);
                if(swapped == false) {
                    break;
                }
            }
        }
        return nums;
    }

    public static int[] swap(int num_i, int num_j) {
        return new int[]{num_j, num_i};
    }

    /* Prints the array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("BubbleSort:");
        int[] nums = new int[]{5, 3, 2, 7, 8, 1, 2};
        int[] output = bubbleSort(nums);
        System.out.println("Output: " + Arrays.toString(output));
    }
}