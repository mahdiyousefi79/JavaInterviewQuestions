package Java_Interview_Coding_Tasks_SDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class String_Same_Letter {

    public static void main(String[] args) {

        String str1 = "abcd";

        String str2 = "dbca";


        System.out.println(same1(str1, str2));
        System.out.println(same2(str1, str2));
        System.out.println(same3(str1, str2));
        System.out.println(same4(str1, str2));
    }
// ---------------------------Solution  ----------------------------------------------------------------


    public static boolean same1(String a, String b) {


        char[] ch1 = a.toCharArray();

        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1 = "", a2 = "";

        for (char each : ch1)

            a1 += each;


        for (char each : ch2)

            a2 += each;


        return a1.equals(a2);

    }

// ---------------------------Solution  ----------------------------------------------------------------


    public static boolean same2(String str1, String str2) {


        String[] arr1 = str1.split("");

        String[] arr2 = str2.split("");

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }


    // ---------------------------Solution By Mahdi  -----------------------------------------------------

    public static boolean same3(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));

        Collections.sort(list1);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(list2);

        return list1.equals(list2);
    }


// ---------------------------Solution By Mahdi - best way -----------------------------------------------------


    public static boolean same4(String str1, String str2) {

        String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();
        return (s1.equals(s2));

    }
}


/*
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */