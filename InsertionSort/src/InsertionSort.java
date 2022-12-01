import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] array) {

        int length = array.length;

        int key, j;

        for (int i = 1; i < length; i++) {

            key = array[i];

            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println(Arrays.toString(array));
    }
}
