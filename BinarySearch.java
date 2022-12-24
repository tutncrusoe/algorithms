public class BinarySearch {

    /*
Time Complexities:
    Best case complexity: O(1)
    Average case complexity: O(log n)
    Worst case complexity: O(log n)

Space Complexity
    The space complexity of the binary search is O(1).
     */
    public static int binarySearch(int[] array, int x, int low, int high) {

        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] > x) {
                return binarySearch(array, x, low, mid - 1);
            }
            return binarySearch(array, x, mid + 1, high);
        }
        return -1;
    }

    public static void process(int[] array, int x) {
        int output = binarySearch(array, x, 0, array.length);
        if (output == -1) {
            System.out.println("Element not found");
        } else {
            System.out.print("Element found at index: " + output);
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 4, 5, 6, 7, 8, 9};
        int x = 4;
        process(array, x);
    }
}
