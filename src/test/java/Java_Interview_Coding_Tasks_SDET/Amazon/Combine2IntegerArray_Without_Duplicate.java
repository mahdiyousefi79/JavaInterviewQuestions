package Java_Interview_Coding_Tasks_SDET.Amazon;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Combine2IntegerArray_Without_Duplicate {
    public static void main(String[] args) {
        int [] arr1 = {8,2,5};
        int [] arr2 = {3,5,6};

        System.out.println(Arrays.toString(combine(arr1,arr2)));
    }

    //-------------------------------- Mahdi ------------------------------------
    public static int [] combine(int[] arr1, int [] arr2) {

        int i =0;
        Set<Integer> set = new LinkedHashSet<>();

        for (int each: arr1) {
            set.add(each);
        }
        for (int each: arr2) {
            set.add(each);
        }
        int [] arr = new int[set.size()];

        for (Integer each: set) {
            arr[i] = each;
            i++;
        }
        return arr;
    }
}
