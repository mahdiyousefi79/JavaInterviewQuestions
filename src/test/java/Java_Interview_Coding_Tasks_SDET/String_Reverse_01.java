package Java_Interview_Coding_Tasks_SDET;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Reverse_01 {

    public static void main(String[] args) {

        String exaple = "ABCD";


        System.out.println(strReverse1(exaple));
        System.out.println(strReverse2(exaple));
        System.out.println(strReverse3(exaple));
        System.out.println(strReverse4(exaple));
    }



    //----------------------------------------   Solution 1  -----------------------------------------------
    public static String strReverse1(String str){

        String result="";

        for(int i=str.length()-1; i >= 0; i--){
            result += str.toCharArray()[i];

        }
         return result;
    }
    //----------------------------------------   Solution 2  -----------------------------------------------

    public  static String  strReverse2(String str) {

        return new StringBuffer(str).reverse().toString();

    }

    //----------------------------------------  Solution by Mahdi 1 -----------------------------------------------
    public static String strReverse3(String str){

        String result ="";

        for(int i=str.length()-1; i>=0; i--){

            result += str.charAt(i);
        }

        return result;

    }
    //----------------------------------------  Solution by Mahdi 2 -----------------------------------------------
    public static String  strReverse4 (String str){
        String result="";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for(int i=list.size()-1; i >= 0; i--){

            result += list.get(i);
        }
        return result;
    }




}
/*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */