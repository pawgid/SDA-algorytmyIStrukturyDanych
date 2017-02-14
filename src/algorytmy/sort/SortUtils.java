package algorytmy.sort;

/**
 * Created by RENT on 2017-02-14.
 */
public class SortUtils {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};
        System.out.println(min(array));
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
