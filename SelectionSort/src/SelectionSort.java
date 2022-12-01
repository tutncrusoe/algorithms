import java.util.Arrays;

/**
 * Độ phức tạp thời gian: O (n2) vì có hai vòng lặp lồng nhau.
 *
 * Không gian phụ trợ: O (1)
 *
 * Điều tốt về sắp xếp lựa chọn là nó không bao giờ tạo ra nhiều hơn O (n) hoán đổi và có thể hữu ích khi ghi bộ nhớ là một hoạt động tốn kém.
 */
public class SelectionSort {

    public void selectionSort(int[] array) {

        int length = array.length;

        int min_index, temp;

        for (int i = 0; i < length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                    j++;
                }
            }

            temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));

    }

}
