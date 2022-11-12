package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;

public class Array_Find_Maximum {


    public static void main(String[] args) {


        int[] arr = {100, 500, 50, 80, 60, -90};


        System.out.println(maxValue1(arr));
        System.out.println(maxValue2(arr));
        System.out.println(maxValue3(arr));



    }
    //------------------------------------------Solution 1:-----------------------------------------

    public static int maxValue1(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int each : arr)

            if (each > max)

                max = each;


        return max;

    }


    //------------------------------------------------Solution 2:------------------------------------------

    public static int maxValue2(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];

    }

    //-----------------------------------solution by mahdi --------------------------------------------
    public static int maxValue3(int[] arr) {


        int max = arr[0];


        for (int each : arr) {

            if (each > max) {

                max = each;
            }
        }

        return max;

    }


/*
Write a method that can find the maximum number from an int Array
 */


}