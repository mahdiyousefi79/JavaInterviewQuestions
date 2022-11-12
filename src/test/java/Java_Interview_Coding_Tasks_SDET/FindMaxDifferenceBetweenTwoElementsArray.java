package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;

public class FindMaxDifferenceBetweenTwoElementsArray {
    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 5, 3, 7, -5, 10,-20};

        System.out.println("findMaxDifference(arr) = " + findMaxDifference(arr));
        findMaxDifference1(arr);
    }

    public static int findMaxDifference(int[] arr) {

        int max = Integer.MIN_VALUE;
        int def ;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    def = arr[i] - arr[j];
                } else {
                    def = arr[j] - arr[i];
                }

                if (def > max) {
                    max = def;
                }
            }
        }
        return max;
    }

    public static void findMaxDifference1(int[] arr) {
        Arrays.sort(arr);
        System.out.println("("+arr[0]+","+arr[arr.length-1]+")"+ " And difference is: "+ (arr[arr.length-1]-arr[0]));
    }
}

/*
Input:  { 2, 7, 9, 5, 1, 3, 5 }

Output: The maximum difference is 7.

The pair is (2, 9)
 */