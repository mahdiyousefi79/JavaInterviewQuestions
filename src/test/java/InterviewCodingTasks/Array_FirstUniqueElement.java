package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {


    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }

    //------------------------ Mahdi ---------------------------------------------------------
    public static void firstDuplicatedElement1(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }
        for (int each : list) {
            int fre = Collections.frequency(list, each);

            if (fre > 1) {
                System.out.println(each);
                break;
            }
        }
    }
}
