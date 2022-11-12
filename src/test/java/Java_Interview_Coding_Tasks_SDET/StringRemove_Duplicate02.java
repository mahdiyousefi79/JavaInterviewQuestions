package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemove_Duplicate02 {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(removeDUp(str));
        System.out.println(removeDup1(str));
        System.out.println(removeDup2(str));
        System.out.println(removeDup3(str));
        System.out.println(removeDup4(str));
        System.out.println(removeDup5(str));
    }


// ---------------------------Solution 1-----------------------------------------------------

    public static String removeDUp(String str) {
        String nonDup = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            if (!nonDup.contains("" + str.charAt(i))) {          // contains method only works with String not char
                nonDup += str.charAt(i);
            }
        }
        return nonDup;
    }
// ---------------------------Solution 2------------------------------------------------------

        public static String removeDup1(String str) {

            str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

            str = str.replace(", ", "").replace("[", "").replace("]", "");

            return str;


        }

//----------------------------------------  Solution by Mahdi 1 -----------------------------------------------

   public static String removeDup2(String str) {

       String result = "";

       String[] arr = str.split("");

       for (int i = 0; i <= str.length() - 1; i++) {

           if (!result.contains(arr[i])) {

               result += arr[i];
           }

       }

       return result;
   }
//----------------------------------------  Solution by Mahdi 2 -----------------------------------------------

       public static String removeDup3(String str){

           Set <String> string = new LinkedHashSet<>(Arrays.asList(str.split("")));

           String result ="";


           for (String each : string) {

               result+=each;

           }

           return result;

       }

    //----------------------------------------  Solution by Mahdi 3 -----------------------------------------------


    public static String removeDup4(String str){


        String result ="";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each;
        }

        return result;

    }
//----------------------------------------  Solution by Mahdi 4 -----------------------------------------------

    public static String removeDup5(String str){



        String   result  =  new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        result =result.substring(1,result.length()-1).replaceAll(",", "").replaceAll(" ","") ;

        return result;

    }




   }




















/*
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
 */