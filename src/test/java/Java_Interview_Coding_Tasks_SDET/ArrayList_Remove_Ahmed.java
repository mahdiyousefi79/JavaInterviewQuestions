package Java_Interview_Coding_Tasks_SDET;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove_Ahmed {


    public static void main(String[] args) {


        // ---------------------Solution 1: ---------------------------------------

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Selin", "Mahdi", "Ali"));

        System.out.println("names = " + names);

        names.removeAll(Arrays.asList("Ahmed"));

        System.out.println("names = " + names);



    }
}