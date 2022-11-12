package Java_Interview_Coding_Tasks_SDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorJava {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            int x = (int) itr.next();
            if (x < 5) {
                itr.remove();
            }
        }
        System.out.println("list = " + list);
    }
}
