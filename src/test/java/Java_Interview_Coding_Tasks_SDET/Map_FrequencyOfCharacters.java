package Java_Interview_Coding_Tasks_SDET;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {


        String str ="abcadefb";
        frequencyTest(str);


        //---------Only to understanding Mahdi
        Map<Character,Integer> map1 = new LinkedHashMap<>();
        map1.put('a', 1);
        map1.put('b', 2);
        map1.put('c', 5);
        System.out.println("map1 = " + map1);
        System.out.println("map1.get('a') = " + map1.get('c'));
        System.out.println("map1.get('a') = " + map1.get('d'));

    }

    /*
    Write a method that prints the frequency of each character from a String
     */

    public static void frequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
