package InterviewCodingTasks;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {

        int [] arr = {1,4,0,2,7,5,0,3,1};

        System.out.println(Arrays.toString(moveZerosToTheEnd1(arr)));
        System.out.println(Arrays.toString(moveZerosToTheEnd2(arr)));
    }


    //--------------   Mahdi -------------------------
    public static int [] moveZerosToTheEnd1(int[] arr) {

        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){

                if (arr[i]==0){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
        }
        return arr;
    }

//-------------------------------------------------------------
    public static int[] moveZerosToTheEnd2(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }
        return result;
    }
}
