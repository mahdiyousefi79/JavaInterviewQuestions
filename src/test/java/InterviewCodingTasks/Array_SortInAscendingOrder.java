package InterviewCodingTasks;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static void main(String[] args) {


        int[] arr = {6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74};

        System.out.println(Arrays.toString(sortingArrayAsc1(arr)));
        sortAsc(arr);

    }


    public static int[] sortingArrayAsc1(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }

    //------------------------------- Mahdi ----------------------------------
    public static void sortAsc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
