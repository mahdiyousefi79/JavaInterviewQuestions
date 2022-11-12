package Java_Interview_Coding_Tasks_SDET;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_int_array_map {

    public static void main(String[] args) {



        int[] arr = {1, 2, 3, 1, 4, 5, 6, 3, 5,5};
        findDup(arr);
        findDupRepeated3Times(arr);
    }
    public static void findDup(int[] arr) {

// for int array we can not use the Collection frequency

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int each: arr) {

            if (map.containsKey(each)){

                map.put(each, map.get(each)+1);
            } else {
                map.put(each,1);
            }
        }

        System.out.println(map);
    }
    // -------------------- Find element repeated 3 times -----------------


    public static void findDupRepeated3Times(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int each : arr) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        for (Map.Entry<Integer, Integer> each : map.entrySet()) {
            if (each.getValue() == 3) {
                System.out.println("each.getKey() = " + each.getKey());
            }
        }
    }
}
