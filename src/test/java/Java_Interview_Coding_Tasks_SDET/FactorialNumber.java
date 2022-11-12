package Java_Interview_Coding_Tasks_SDET;

public class FactorialNumber {
    public static void main(String[] args) {
        int n=8;
        System.out.println("factorialNumber(n) = " + factorialNumber(n));
    }


    public static int factorialNumber(int n) {


        int result = 1;

        for (int i = 1; i <= n; i++) {

            result = result * i;

        }

        return result;

    }


    //Write a return method that returns the factorial number of any given number


}