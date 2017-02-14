package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};
        int[] sortedArray = bubbleSort.ascSort(array);
        System.out.println(Arrays.toString(sortedArray));
        
    }

    public int[] ascSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j+1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

    public int[] descSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] < array[j+1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

    private void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}