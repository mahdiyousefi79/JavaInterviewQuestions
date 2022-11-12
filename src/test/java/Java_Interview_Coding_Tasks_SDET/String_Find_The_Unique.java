package Java_Interview_Coding_Tasks_SDET;

import java.util.*;

public class String_Find_The_Unique {


    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";


        System.out.println(unique1(str));
        System.out.println(unique2(str));
        System.out.println(unique3(str));
        System.out.println(unique4(str));
        System.out.println(unique5(str));
        System.out.println(unique6(str));
        System.out.println(unique7(str));
        System.out.println(unique8(str));
    }

    // ---------------------------Solution 1-----------------------------------------------------
    public static String unique1(String str) {


        String[] arr = str.split("");


        String result = "";

        for (int j = 0; j <= arr.length - 1; j++) {


            int count = 0;
            for (int i = 0; i <= arr.length - 1; i++) {

                if (arr[j].equals(arr[i])) {
                    count++;
                }
            }


            if (count == 1) {
                result += arr[j];
            }

        }
        return result;
    }
// ---------------------------Solution 2-----------------------------------------------------


    public static String unique2(String str) {

        String result = "";

        for (String each : str.split("")) {


            result += (Collections.frequency(Arrays.asList(str.split("")), each) == 1) ? each : "";


        }
        return result;
    }

    // ---------------------------Solution By Mahdi  -----------------------------------------------------
    public static String unique3(String str) {

        String result = "";

        for (String each : str.split("")) {


            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);


            if (frequency == 1) {
                result += each;
            }

        }
        return result;
    }


// ---------------------------Solution By Mahdi  -----------------------------------------------------


    public static String unique4(String str) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (String each : list) {

            int frequency = Collections.frequency(list, each);


            if (frequency == 1) {
                result += each;
            }

        }
        return result;
    }


    // ---------------------------Solution By Mahdi  -----------------------------------------------------


    public static String unique5(String str) {

        Map<String, Integer> map = new LinkedHashMap<>();
        String result ="";

        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        for (Map.Entry<String,Integer> each: map.entrySet()){
            if (each.getValue()==1){
                result +=each.getKey();
            }
        }
        return result;
    }

    public static String unique6(String str) {

        String result = "";

        for (int j = 0; j <= str.length() - 1; j++) {
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result += str.charAt(j);
            }

        }
        return result;
    }

    public static String unique7(String str) {

        String result = "";

        for (String each : str.split("")) {

            int fre = Collections.frequency(Arrays.asList(str.split("")), each);
            if (fre == 1 && !result.contains(each)) {
                result += each + " ";
            }
        }
        return result;
    }
// -----------------Find by Stream ------------------------------------------

    public static String unique8(String str) {

        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>();

        String result = "";
        Arrays.stream(arr)
                .distinct()
                .forEach(p -> list.add(p));

        for (String each : list) {
            result += each;
        }

        return result;
    }
}
//---------------------------------- Amazon --------------------------------------



/*
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */