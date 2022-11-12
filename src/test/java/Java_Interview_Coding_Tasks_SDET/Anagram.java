package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        String str1 = "Mother In Law";
        String str2 = "Hitler Woman";

        isAnagram(str1,str2);
    }

    static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll(" ", "");
        String s2 = str2.replaceAll(" ", "");
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status = Arrays.equals(arr1, arr2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}





