package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FindMaxNum_String {

    public static void main(String[] args) {

        String str = "a12rts65af43";

        String str1 = str.replaceAll("[a-z]", ",");
        System.out.println("str1 = " + str1);


        String str2 = str.replaceAll("[^1-9]", ",");
        System.out.println("str2 = " + str2);

        System.out.println( str.charAt(1) );  // ---------> 1
        System.out.println( str.charAt(1) + 1  );  // ---------> 49+1 = 50
        System.out.println( str.charAt(1) - '0' + 1  );  // ---------> 1+1 = 2

        System.out.println("extractMaximum(str) = " + extractMaximum(str));
        extractMaximum1(str);


    }

    static int extractMaximum(String str) {

        str =str+"a"; // I add this one because without this if last number be max, and after that doesn't have any string will jump to out of loop and
                      // will not calculate max
        int num = 0;
        int max = Integer.MIN_VALUE;

        // Start traversing the given string
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i) - '0');

                // Update maximum value
            } else {
                max = Math.max(max, num);

                // Reset the number
                num = 0;
            }
        }

        // Return maximum value
        return max;
    }
    static void extractMaximum1(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[a-z]", "@");
        String[] str1 = str.split("@");

        System.out.println(Arrays.toString(str1));


        List<String> str2 = stream(str1).filter(p -> p != "").collect(Collectors.toList());
        //  System.out.println((Integer.parseInt(str2.stream().max(Integer::compare)).get));


        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < str2.size(); i++) {
            if (Integer.parseInt(str2.get(i)) > Max) {
                Max = Integer.parseInt(str2.get(i));

            }
        }
        System.out.println(Max);
    }
    }

