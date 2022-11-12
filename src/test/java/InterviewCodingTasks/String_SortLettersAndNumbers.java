package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class String_SortLettersAndNumbers {

    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together

        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"

     */
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";

        System.out.println("sortLettersAndNumbers1(str) = " + sortLettersAndNumbers1(str));
        System.out.println("sortLettersAndNumbers2(str) = " + sortLettersAndNumbers2(str));
    }
    public static String sortLettersAndNumbers1(String str) {

        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    temp += ",";
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
        }


        String[] arr = temp.split(",");
        str = "";

        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }

        return str;
    }

//------------------------------------By Mahdi -------------------------------------------------
public static String sortLettersAndNumbers2(String str) {

    ArrayList<Character> char1 = new ArrayList<>();
    ArrayList<Character> char2 = new ArrayList<>();
    String result = "";
    for (char each : str.toCharArray()) {

        if (Character.isLetter(each)) {
            char1.add(each);

        }
        if (Character.isDigit(each)) {
            char2.add(each);
        }

    }
    for(char each : char1){
        result += each;
    }
    for (char each: char2){
        result+= each;
    }
    return result;
}

}
