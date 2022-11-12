package Java_Interview_Coding_Tasks_SDET;

public class PrimeNumber {


    public static void main(String[] args) {
        System.out.println("findNthPrimeNumber(5) = " + findNthPrimeNumber(5));
        findPrimeNumbersBetweenTill100();
    }


    // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //----------------- Amazon ----------------------------------------

    //find nth prime number:
    public static int findNthPrimeNumber(int nth) {
        int num, count, i;
        num = 1;
        count = 0;

        while (count != nth) {
            num++;

            for (i = 2; i <= num; i++) {

                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count++;
            }
        }
        return num;
    }


    public static void findPrimeNumbersBetweenTill100() {

        int i;
        int num = 1;

        while (num < 100) {
            num++;
            for (i = 2; i <= 100; i++) {

                if (num % i == 0) {
                    break;
                }

            }
            if (num == i) {
                System.out.print(num + " ");
            }
        }
    }
}

//Write a method that can check if a number is prime or not
//
//
/*
A prime number is a number greater than 1 with only two factors –
themselves and 1. A prime number cannot be divided by any other numbers without leaving a remainder.
 An example of a prime number is 13. It can only be divided by 1 and 13. ...
 15 is an example of a composite number because it has more than two factors.
 */


//That given an array of integers as input, prints out the pair with the largest difference
// given an integer as input, return whether it is palindrome or not
