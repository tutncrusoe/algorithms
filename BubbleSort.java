import java.util.Arrays;

public class BubbleSort {

    /*
Hence, the number of comparisons is

(n-1) + (n-2) + (n-3) +.....+ 1 = n(n-1)/2
nearly equals to n2

Hence, Complexity: O(n2)

Also, if we observe the code, bubble sort requires two loops. Hence, the complexity is n*n = n2

1. Time Complexities
Worst Case Complexity: O(n2)
If we want to sort in ascending order and the array is in descending order then the worst case occurs.
Best Case Complexity: O(n)
If the array is already sorted, then there is no need for sorting.
Average Case Complexity: O(n2)
It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
2. Space Complexity
Space complexity is O(1) because an extra variable is used for swapping.
In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).
Bubble Sort Applications
Bubble sort is used if

complexity does not matter
short and simple code is preferred
     */
    public static int[] bubbleSort(int[] nums) {
        boolean sorted;
        for (int i = 0; i < nums.length - 1; i++) {
            sorted = true;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int[] swap = swap(nums[j], nums[j + 1]);
                    nums[j] = swap[0];
                    nums[j + 1] = swap[1];
                    sorted = false;
                }
                printArray(nums);
                if (sorted) {
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