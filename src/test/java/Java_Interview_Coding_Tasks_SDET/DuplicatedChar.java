package Java_Interview_Coding_Tasks_SDET;

import java.util.*;

public class DuplicatedChar {
    public static void main(String[] args) {
        String str = "football";
        printDupChars(str);
        System.out.println("---------------------");
        printDupChars1(str);
        System.out.println("---------------------");
        printDupChars2(str);
        System.out.println("---------------------");
        printDupChars3(str);
    }

    public static void printDupChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    result += str.charAt(i) + " ";
                }
            }
        }
        System.out.println(result);
    }

    public static void printDupChars1(String str) {
        String result = "";
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if (set.contains(str.charAt(i))) {
                result += str.charAt(i) + " ";
            }
            set.add(str.charAt(i));
        }
        System.out.println("result = " + result);
    }

    public static void printDupChars2(String str) {
        String result = "";

        for (String each : str.split("")) {

            int fre = Collections.frequency(Arrays.asList(str.split("")), each);
            if (fre > 1 && !result.contains(each)) {
                result += each + " ";
            }
        }
        System.out.println("result = " + result);
    }


    //-----------------best way ---------------------------------------------------------
    public static void printDupChars3(String str) {
        String result = "";

        Set<String> set = new LinkedHashSet<>();
        for (String each : str.split("")) {
         if (set.contains(each)){
             System.out.print(each+" ");
         }
         set.add(each);
        }
    }
}