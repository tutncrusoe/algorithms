public class LinearSearch {

    /*
    Linear Search Applications
    For searching operations in smaller arrays (<100 items).
    Linear Search Complexities

    Time Complexity: O(n)
    Space Complexity: O(1)
     */
    public static int linearSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void process(int[] array, int x) {
        int output = linearSearch(array, x);
        if (output == -1) {
            System.out.println("Element not found");
        } else {
            System.out.print("Element found at index: " + output);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 0, 1, 9};
        int x = 1;

        process(array, x);
    }
}
