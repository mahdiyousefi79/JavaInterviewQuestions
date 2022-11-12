package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class P1_Common_Substring {

    public static void main(String[] args) {


        String str1 = "art";

        String str2 = "ammo";


        System.out.println("sameChek(str1,str2) = " + checkCommon1(str1, str2));
        System.out.println("sameChek(str1,str2) = " + checkCommon2(str1, str2));
    }

    public static boolean checkCommon1(String str1, String str2) {

        String result = "";

        for (int i = 0; i <= str1.length() - 1; i++) {

            if (str2.contains(str1.charAt(i) + "")) {
                result += str1.charAt(i);
                break;

            }

        }
        return (result.length() != 0);

    }


    public static boolean checkCommon2(String str1, String str2) {
        for (String each : new LinkedHashSet<>(Arrays.asList(str1.split("")))) {

            if (str2.contains(each)) {
                return true;
            }
        }
        return false;
    }
}
/*
Given two strings, determine if they share a common substring. A substring may be as small as one character.
Example:
String1 = “art”
String 2 = “ammo”
Both string share ‘a’, so return true;
Example 2:
String1 = “be”
String 2 = “cat”
No characters are shared, so return false;

 */