package Java_Interview_Coding_Tasks_SDET;

public class Sum_Of_Digits_In_String {
    public static void main(String[] args) {


        String str = "A2B3cd105";
        System.out.println(sumOfDigits(str));
        System.out.println(sumOfDigits1(str));
        System.out.println(sumOfDigits2(str));
        System.out.println(sumOfDigits3(str));
    }
// ---------------------------Mahdi  ----------------------------------------------------------------

    public static int sumOfDigits(String str) {

        int r =0;
        for (Character each: str.toCharArray()){

            if (Character.isDigit(each)) {
                r += each-'0';
            }
        }
        return r;
    }
// ----------------------------------------------------------------------------------------------

    public static int sumOfDigits1(String str) {

        int total = 0;

        char[] ch = str.toCharArray();

        for (char each : ch) {

            if (Character.isDigit(each)) {

                total += Integer.parseInt("" + each);    // this method only convert String not chart

            }

        }

        return total;
    }

// ---------------------------Solution By Mahdi ----------------------------------------------------------------

    public static int sumOfDigits2(String str) {

        int total = 0;


        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {

                total += Integer.parseInt("" + each);     // this method only convert String not chart
            }
        }

        return total;
    }
    //-------------------------------Mahdi -----------------------------------------------
    public static int sumOfDigits3(String str) {

        int result = 0;
        for (int i = 0; i < str.length(); i++) {


            if (Character.isDigit(str.charAt(i))) {

                result +=  Integer.parseInt(str.charAt(i)+"");
            }
        }
        return result;
    }
}

/*
Write a method that can return the sum of the digits in a string
 */

