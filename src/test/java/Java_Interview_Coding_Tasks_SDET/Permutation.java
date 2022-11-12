package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {
        char [] arr = {'a','b','c'};
        String str ="abc";

        System.out.println("permutation(str) = " + permutation(str));
        System.out.println("permutation1(arr) = " + permutation1(arr));

    }
    //-------------------------------- Mahdi ------------------------------------
    public static Set<String> permutation(String str) {

        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);

        } else {
            for (int i = 0; i < str.length(); i++) {
                String a = str.substring(0, i) + str.substring(i + 1);

                for (String each : permutation(a)) {
                    set.add(str.charAt(i) + each);
                }
            }
        }
        return set;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static Set<String> permutation1(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");


        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);

        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation1(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }
        }
        return set;
    }
}
