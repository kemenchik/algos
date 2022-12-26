package algos;

/**
 * Поиск в массиве
 */

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = new int[]{63, 65};
        System.out.println(searchLinear(array, 65));

        SortArray.bubbleSort(array);

        System.out.println(searchBinary(array, 65));
    }

    /**
     * Линейный поиск в массиве
     */

    public static int searchLinear(int[] array, int toFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Бинарный поиск в массиве (массив должен быть отсортирован)
     */

    public static int searchBinary(int[] array, int toFind) {
        if (array.length > 0) {
            return searchBinaryRecursive(array, 0, array.length - 1, toFind);
        } else {
            return -1;
        }
    }

    private static int searchBinaryRecursive(int[] array, int startIndex, int endIndex, int toFind) {
        if (endIndex < startIndex) {
            return -1;
        }
        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        if (array[middleIndex] == toFind) {
            return middleIndex;
        }
        if (array[middleIndex] > toFind) {
            return searchBinaryRecursive(array, startIndex, middleIndex - 1, toFind);
        } else {
            return searchBinaryRecursive(array, middleIndex + 1, endIndex, toFind);
        }
    }
}
