package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};
        System.out.println(Arrays.toString(selectionSort.ascSort(array)));
        System.out.println(Arrays.toString(selectionSort.descSort(array)));
    }

    public int[] ascSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[index] < array[j]) {
                    index = j;
                }
            }
            SortUtils.swap(array, index, array.length - i - 1);
        }
        return array;
    }

    public int[] descSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            SortUtils.swap(array, index, array.length - i - 1);
        }
        return array;
    }
}
