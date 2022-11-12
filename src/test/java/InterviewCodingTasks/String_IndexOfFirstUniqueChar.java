package InterviewCodingTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_IndexOfFirstUniqueChar {

    /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */

    public static void main(String[] args) {
        String str = "aabbbccfrtte";

        System.out.println("indexOfFirstNonRepeatingChar(str1) = " + indexOfFirstNonRepeatingChar1(str));
        System.out.println("indexOfFirstNonRepeatingChar(str2) = " + indexOfFirstNonRepeatingChar2(str));
    }


    //-------------------------- Mahdi -----------------------------------------------
    public static int indexOfFirstNonRepeatingChar1(String str) {

        int result = 0;
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            int fre = Collections.frequency(Arrays.asList(str.split("")), each);

            if (fre != 1) {
                result = -1;
            } else if (fre == 1) {
                result = str.indexOf(each);
                break;
            }
        }
        return result;
    }

    public static int indexOfFirstNonRepeatingChar2(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (char each : s.toCharArray()) {
                if (each == s.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }
}
