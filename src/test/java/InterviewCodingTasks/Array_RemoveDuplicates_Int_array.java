package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_RemoveDuplicates_Int_array {

    /*
    Write a function that can remove the duplicates from an array of integers
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 2};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(Arrays.toString(removeDuplicates1(arr)));
        System.out.println(Arrays.toString(removeDuplicates2(arr)));
    }

    // solution 1 -------------------------------------------------------
    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }


    //solution 2--------------------------------------------------------
    public static int[] removeDuplicates1(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;

    }

    //---------------------Mahdi------------------------
    public static int[] removeDuplicates2(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int each : arr) {
            set.add(each);
        }
        arr = new int[set.size()];
        int i = 0;
        for (int each : set) {
            arr[i] = each;
            i++;
        }
        return arr;
    }
}
