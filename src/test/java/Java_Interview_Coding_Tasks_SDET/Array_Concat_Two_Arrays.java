package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;

public class Array_Concat_Two_Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(concatTwoArrays1(arr1, arr2)));
        System.out.println(Arrays.toString(concatTwoArrays2(arr1, arr2)));
    }


    public static int[] concatTwoArrays1(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {

            arr[i] = each;

            i++;

        }

        for (int each : arr2) {

            arr[i] = each;

            i++;

        }

        return arr;
    }

    //-----------------------------------solution by mahdi --------------------------------------------
    public static int[] concatTwoArrays2(int[] arr1, int[] arr2) {


        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i <= arr1.length - 1; i++) {

            arr[i] = arr1[i];


        }
        for (int i = 0; i <= arr2.length - 1; i++) {

            arr[arr1.length + i] = arr2[i];
        }

        return arr;
    }

/*
Write a return method that can concat two arrays
 */
}