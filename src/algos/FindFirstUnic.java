package algos;

import java.util.*;

public class FindFirstUnic {

    public static void main(String[] args) {
        System.out.println(findFirstUnic(List.of(2, 2, 3, 4, 5, 6, 1, 4, 6, 5, 3, 3)));
    }

    public static Integer findFirstUnic(List<Integer> integerList) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (Integer integer : integerList) {
            map.putIfAbsent(integer, 0);
            map.computeIfPresent(integer, (k, v) -> ++v);
        }

        for (Map.Entry<Integer, Integer> integer : map.entrySet()) {
            if (integer.getValue() == 1) {
                return integer.getKey();
            }
        }

        return null;
    }
}
