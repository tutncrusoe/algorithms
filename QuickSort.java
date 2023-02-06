/*
https://www.youtube.com/watch?v=PgBzjlCcFvc&t=90s
*/

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex < rightMostIndex) {
            int pivotIndex = partition(array, leftMostIndex, rightMostIndex);
            quickSort(array, leftMostIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, rightMostIndex);
        }
    }

    public static int partition(int[] array, int leftMostIndex, int rightMostIndex) {
        int pivotIndex = array[rightMostIndex];
        int storeIndex = leftMostIndex - 1;
        for (int i = leftMostIndex; i < rightMostIndex; i++) {
            storeIndex++;
            swap(array[i], array[storeIndex]);
        }
        swap(pivotIndex, array[storeIndex + 1]);
        return storeIndex + 1;
    }

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
