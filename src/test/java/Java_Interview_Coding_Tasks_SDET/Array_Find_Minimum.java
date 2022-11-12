package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;

public class Array_Find_Minimum {


    public static void main(String[] args) {
        int[] arr = {100, 500, 50, 80, 60, -90, 200, -180, 50, 60, -20};


        System.out.println(minValue1(arr));
        System.out.println(minValue2(arr));
        System.out.println(minValue3(arr));




    }
//------------------------------------------Solution 1:-----------------------------------------

    public static int minValue1(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int each : arr) {
            if (each < min) {

                min = each;
            }
        }


        return min;
    }
//------------------------------------------------Solution 2:------------------------------------------

    public static int minValue2(int[] arr) {

        Arrays.sort(arr);


        return arr[0];
    }

//------------------------------------------------Solution By Mahdi -------------------------------------

    public static int minValue3(int[] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {

                min = each;
            }
        }


        return min;
    }


    /*
    Write a method that can find the maximum number from an int Array
     */

}