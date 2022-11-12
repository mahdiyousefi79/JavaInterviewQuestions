package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,3,0,5,3,1,0,3,5,1));

        System.out.println("moveZerosToTheEnd(list) = " + moveZerosToTheEnd(list));
    }


    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int sizeBeforeDeleteZero = list.size();
        list.removeAll(Arrays.asList(0));
        int sizeAfterDeleteZero = list.size();
        int totalNumberOfZeros = sizeBeforeDeleteZero - sizeAfterDeleteZero;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }
}
