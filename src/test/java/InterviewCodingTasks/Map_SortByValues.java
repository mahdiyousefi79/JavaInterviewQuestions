package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_SortByValues {

    /*
        Write a method that can sort the map by values
     */
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("a",2);
        map.put("c",4);
        map.put("b",3);
        map.put("e",1);
        map.put("f",6);

        System.out.println("map = " + map);
        System.out.println(sortByValue(map));


    }


    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer>  result= new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            result.put(each.getKey(), each.getValue());
        }
        return result;
    }

}
