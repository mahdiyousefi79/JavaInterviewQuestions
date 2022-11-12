package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintPairOfSum_Array {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 5, 2, 3, 6};

        printPairs1(arr, 6);
        System.out.println("---------");
        printPairs2(arr, 6);
        System.out.println("---------");
        printPairs3(arr, 6);

    }


    //---------------------------------------------------------
    public static void printPairs1(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i] + arr[j]) == sum) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println();
    }

    //------------------------ Amazon way -----------------------------
    public static void printPairs2(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];

            if (set.contains(temp)) {
                System.out.println("(" + arr[i] + "," + temp + ")");
            }
            set.add(arr[i]);
        }
    }

    //------------------------ Amazon way -----------------------------
    public static void printPairs3(int[] arr, int sum) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println(arr[low] + ", " + arr[high]);
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            } else {
                low++;
            }
        }
    }

}


/*
To increase difficulty:

* Ask about repeated pairs and make the candidate exclude them
* Ask about excluding [0, 0]
* Ask about excluding inverted pairs for example, exclude [2, 3] if [3, 2] has already been printed
* Ask about how to do this in O(n)
 */
/*
Sample Coding Problem #1

Write a method/function that given an array of integers and a number as inputs, prints out all pairs in the array whose sum is equal to that number. Example:
inputs:

* [1, 0, 3, 5, 2, 3, 6]
* 6

output:

* [1, 5]
* [0, 6]
* [3, 3]


To increase difficulty:

* Ask about repeated pairs and make the candidate exclude them
* Ask about excluding [0, 0]
* Ask about excluding inverted pairs for example, exclude [2, 3] if [3, 2] has already been printed
* Ask about how to do this in O(n)

*/