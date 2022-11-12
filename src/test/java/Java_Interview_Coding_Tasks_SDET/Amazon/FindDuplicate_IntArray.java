package Java_Interview_Coding_Tasks_SDET.Amazon;

import java.util.*;

public class FindDuplicate_IntArray {

    public static void main(String[] args) {


        int arr[] = {1, 2, 1, 3, 4, 5, 6, 5, 8, 6};

        findDuplicated1(arr);
        findDuplicated2(arr);

        System.out.println("findDuplicated(arr) = " + findDuplicated3(arr));
        System.out.println("findDuplicated(arr) = " + findDuplicated4(arr));


    }
    public static void findDuplicated1(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int each: arr) {

            if (set.contains(each)){
                System.out.println(each);
            }
            set.add(each);
        }
    }
//--------------------------------------------------------------------------
    public static void findDuplicated2(int[] arr) {

       Map<Integer,Integer> map = new LinkedHashMap<>();
       for (int each: arr){
           if (map.containsKey(each)){
               map.put(each,map.get(each)+1);
           }else{
               map.put(each,1);
           }
       }

       for (Map.Entry<Integer,Integer> each: map.entrySet()){

           if (each.getValue()>1) {
               System.out.println(each.getKey());
           }
       }
    }

//------------------------------------------------------------------------------------

    public static ArrayList<Integer> findDuplicated3(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();
        ArrayList<Integer> duplicated = new ArrayList<>();

        for (int each : arr) {

            if (set.add(each) == false) {
                duplicated.add(each);
            }
        }
        return duplicated;
    }
// ------------------------------------------------------------------------------------------------------
// this way is not a good way to solve

    public static int findDuplicated4(int[] arr) {

        String result = "";

        Set<Integer> set = new LinkedHashSet<>();
        ArrayList<Integer> duplicated = new ArrayList<>();

        for (int each : arr) {

            if (set.add(each) == false) {
                result += each;
            }
        }
        return Integer.parseInt(result);
    }
}