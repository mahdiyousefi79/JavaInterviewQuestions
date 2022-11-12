package InterviewCodingTasks;

import java.util.Arrays;

public class Reverse_int_array {

    /*
    write a function that can reverse an array
     */
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 8, 6};

        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse1(arr)));
        System.out.println(Arrays.toString(reverse2(arr)));

    }

    public static int[] reverse(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;
    }

    //---------------------------- Mahdi -----------------------------------
    public static int[] reverse1(int[] arr) {


        int j = 0;
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            result[j] = arr[i];
            j++;
        }
        return result;
    }

    // ------------------- Mahdi Best One --------------------------------------------

    public static int[] reverse2(int[]  arr) {

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){

                arr[i] = arr[i]+arr[j];
                arr[j] =arr[i]-arr[j];
                arr[i] =arr[i]-arr[j];
            }
        }
        return arr;
    }
}