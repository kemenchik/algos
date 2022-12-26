package algos;

import java.util.Arrays;

/**
 * Сортировка слиянием
 */

public class MergeNArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[][]{{1, 2, 3}, {1, 2}, {1, 4}, {6, 7, 9}, {5, 8}})));
    }

    public static int[] mergeArrays(int[][] arrays) {
        int[] result = new int[Arrays.stream(arrays).map(el -> el.length).mapToInt(el -> el).sum()];
        int[] counters = new int[arrays.length];
        for (int i = 0; i < result.length; i++) {
            int min = Integer.MAX_VALUE;
            int indexMax = 0;
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[j].length != counters[j] && min > arrays[j][counters[j]]) {
                    min = arrays[j][counters[j]];
                    indexMax = j;
                }
            }
            counters[indexMax]++;
            result[i] = min;
        }
        return result;
    }
}
