/*
https://www.youtube.com/watch?v=PgBzjlCcFvc&t=90s
https://www.programiz.com/dsa/quick-sort
*/

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex < rightMostIndex) {
            int pivotIndex = partition(array, leftMostIndex, rightMostIndex);
            // recursive call on the left of pivot
            quickSort(array, leftMostIndex, pivotIndex - 1);
            // recursive call on the right of pivot
            quickSort(array, pivotIndex + 1, rightMostIndex);
        }
    }

    public static int partition(int[] array, int leftMostIndex, int rightMostIndex) {
        int pivotIndex = array[rightMostIndex];
        int storeIndex = leftMostIndex - 1;
        for (int i = leftMostIndex; i < rightMostIndex; i++) {
            storeIndex++;
            //swap(array[i], array[storeIndex]);
        }
        //swap(pivotIndex, array[storeIndex + 1]);
        return storeIndex + 1;
    }

    /*
    1. Time Complexities:
    - The Worst Case Complexity [Big-O]: O(n2): It occurs when the pivot element picked is either the greatest or the smallest element.
    - Best Case Complexity [Big-omega]: O(n*log n): It occurs when the pivot element is always the middle element or near to the middle element.
    - Average Case Complexity [Big-theta]: O(n*log n): It occurs when the above conditions do not occur.

    2. Space Complexity: The space complexity for quicksort is O(log n).

    *Quicksort algorithm is used when:
    - the programming language is good for recursion.
    - time complexity matters.
    - space complexity matters.
    */

    public static void main(String args[]) {

        int[] data = {8, 7, 2, 1, 0, 9, 6};

        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
