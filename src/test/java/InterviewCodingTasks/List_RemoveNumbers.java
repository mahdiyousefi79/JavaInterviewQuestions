package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,20,86,300,200,20,500,40,86));

        System.out.println("remove1(list) = " + remove1(list));

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,20,86,300,200,20,500,40,86));
        System.out.println("remove2(list) = " + remove2(list1));


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,20,86,300,200,20,500,40,86));
        System.out.println("remove3(list) = " + remove3(list2));
    }



    // solution 1
    public static List<Integer> remove1(List<Integer> list){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        return list;
    }



    // solution 2 -------------------------------------------------------------------------------
    public static List<Integer> remove2(List<Integer> list){
        list.removeIf(p -> p >100);
        return list;
    }
   //-------------------------- -Mahdi ----------------------------------------
   List<Integer> list1 = new ArrayList<>(Arrays.asList(1,20,86,300,200,20,500,40,86));
    public static List<Integer> remove3(List<Integer> list){

        list.stream()
             .filter(p -> p <100)
                .distinct()
              .toList();
        return list;
    }
}
