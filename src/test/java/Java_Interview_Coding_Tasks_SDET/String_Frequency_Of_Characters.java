package Java_Interview_Coding_Tasks_SDET;

import java.util.*;

public class String_Frequency_Of_Characters {
    public static void main(String[] args) {


        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars1(str));
        System.out.println(FrequencyOfChars2(str));
        System.out.println(FrequencyOfChars3(str));
        System.out.println(FrequencyOfChars4(str));
        System.out.println(FrequencyOfChars5(str));
        System.out.println(FrequencyOfChars6(str));
        System.out.println(FrequencyOfChars7(str));
        System.out.println(FrequencyOfChars8(str));
    }

    //---------------------------solution 1:------------------------------------------------------

    public static String FrequencyOfChars1(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);


        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult += nonDup.charAt(j) + "" + count;

        }

        return expectedResult;

    }


    //------------------------------ solution 2:-------------------------------------------------

    public static String FrequencyOfChars2(String str) {

        String expectedResult = "";

        while (!str.isEmpty()) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(0)) {

                    count++;

                }

            }

            expectedResult += str.charAt(0) + "" + count;

            str = str.replace("" + str.charAt(0), "");

        }

        return expectedResult;

    }


    //-------------------------------------- Solution 3:-------------------------------------------

    public static String FrequencyOfChars3(String str) {

        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ", "").replace("[", "").replace("]", "");

        String result = "";

        for (int j = 0; j < b.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.substring(i, i + 1).equals("" + str.charAt(j)))

                    count++;

            }

            result += b.substring(j, j + 1) + count;

        }

        return result;

    }


    //------------------------------Solutions 4:--------------------------------------------------------

    public static String FrequencyOfChars4(String str) {

        String nonDup = "", result = "";

        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);


        for (int i = 0; i < nonDup.length(); i++) {

            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));

            result += "" + nonDup.charAt(i) + num;

        }


        return result;

    }

    //-----------------------------------solution by mahdi --------------------------------------------
    public static String FrequencyOfChars5(String str) {


        String nonDup = "", result = "";
        for (int i = 0; i <= str.length() - 1; i++) {

            if (!nonDup.contains("" + str.charAt(i))) {

                nonDup += "" + str.charAt(i);
            }
        }


        for (int i = 0; i <= nonDup.length() - 1; i++) {


            int frequency = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));


            result += "" + nonDup.charAt(i) + frequency;

        }

        return result;

    }
//-----------------------------------solution by mahdi best way--------------------------------------------


    public static String FrequencyOfChars6(String str) {

        String result = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            int f = Collections.frequency(Arrays.asList(str.split("")), each);

            result += each + f;

        }
        return result;
    }

//-----------------------------------solution by mahdi --------------------------------------------

    public static Map<String,Integer> FrequencyOfChars7 (String str){

        Map<String,Integer>map =new LinkedHashMap<>();

        for(String each:str.split("")){

            int f = Collections.frequency(Arrays.asList(str.split("")),each);
            map.put(each,f);

        }

        return map;

    }
    //-----------------------------------solution by mahdi --------------------------------------------

    public static String FrequencyOfChars8(String str) {
        String result = "";

        for (String each : str.split("")) {

            int f = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!result.contains(each)) {
                result += each + f;
            }
        }
        return result;

    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */