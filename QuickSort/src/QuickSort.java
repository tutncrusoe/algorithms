// https://www.youtube.com/watch?v=PgBzjlCcFvc&t=90s

import java.util.Arrays;

class Quicksort {

    // method to find the partition position
    static int partition(int[] array, int leftMostIndex, int rightMostIndex) {

        // choose the rightmost element as pivotIndex
        int pivotIndex = array[rightMostIndex];

        // pointer for greater element
        int storeIndex = (leftMostIndex - 1);

        // traverse through all elements
        // compare each element with pivotIndex
        for (int i = leftMostIndex; i < rightMostIndex; i++) {
            if (array[i] <= pivotIndex) {

                // if element smaller than pivotIndex is found
                // swap it with the greater element pointed by storeIndex
                storeIndex++;

                // swapping element at storeIndex with element at i
                int temp = array[storeIndex];
                array[storeIndex] = array[i];
                array[i] = temp;
            }
        }
        // swapt the pivotIndex element with the greater element specified by storeIndex + 1
        int temp = array[storeIndex + 1];
        array[storeIndex + 1] = array[rightMostIndex];
        array[rightMostIndex] = temp;

        // return the position from where partition is done
        return (storeIndex + 1);
    }

    static void quickSort(int[] array, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex < rightMostIndex) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivotIndex = partition(array, leftMostIndex, rightMostIndex);

            // recursive call on the left of pivot
            quickSort(array, leftMostIndex, pivotIndex - 1);

            // recursive call on the right of pivot
            quickSort(array, pivotIndex + 1, rightMostIndex);
        }
    }
}

// Main class
class Main {
    public static void main(String args[]) {

        int[] data = {8, 7, 2, 1, 0, 9, 6};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        Quicksort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}