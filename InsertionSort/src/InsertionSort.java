import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Độ phức tạp về thời gian: O (n * 2)
 *
 * Không gian phụ trợ: O (1)
 *
 * Trường hợp ranh giới: Sắp xếp chèn mất thời gian tối đa để sắp xếp nếu các phần tử được sắp xếp theo thứ tự ngược lại.
 * Và cần thời gian tối thiểu (Thứ tự của n) khi các phần tử đã được sắp xếp.
 *
 * Mô hình thuật toán: Phương pháp tiếp cận gia tăng
 *
 * Sắp xếp tại chỗ: Có
 *
 * Ổn định: Có
 *
 * Trực tuyến: Có
 *
 * Công dụng: Sắp xếp chèn được sử dụng khi số lượng phần tử nhỏ.
 * Nó cũng có thể hữu ích khi mảng đầu vào gần như được sắp xếp, chỉ có một số phần tử bị đặt sai vị trí trong một mảng lớn hoàn chỉnh.
 */
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
