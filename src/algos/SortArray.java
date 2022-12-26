package algos;

import java.util.Arrays;

/**
 * Сортировка массива
 */

public class SortArray {

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 2, 9, 1};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     * Быстрая сортировка ( на рандомных данных в +- 1000 раз выигрыш в скорости )
     */

    public static void quickSort(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    private static void quickSortRecursive(int[] array, int from, int to) {
        if (from < to) {
            int separationIndex = partition(array, from, to);
            quickSortRecursive(array, from, separationIndex - 1);
            quickSortRecursive(array, separationIndex, to);
        }
    }

    private static int partition(int[] array, int from, int to) {
        int right = to;
        int left = from;

        int pivot = array[from + (to - from) / 2];

        while (left <= right) {

            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }

    /**
     * Сортировка пузырьком
     */

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    /**
     * Сортировка выборкой
     */

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = getMinFromRange(array, i);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    private static int getMinFromRange(int[] array, int startIndex) {
        int minIndex = startIndex;
        int minValue = array[minIndex];
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }
}
