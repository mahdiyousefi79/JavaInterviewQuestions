package Java_Interview_Coding_Tasks_SDET;

import java.util.Arrays;

public class FINRA {


    public static void main(String[] args) {

        FINRA();
        FINRA1();
        FINRA3();
    }


/*
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
 for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.


 */
//------------------------------------------Solution 1:-----------------------------------------
    public static void FINRA() {


        String result="";

        for (int i = 1; i <= 30; i++) {

            if (i % 3==0  && i% 5 ==0) {
                result += "FINRA"+" ";


            }else if (i% 3==0) {
                result += "FIN"+" ";


            }else if (i % 5==0 ){

                    result += "RA"+" ";

            } else {
                result +=i+ " ";
            }

        }
        System.out.println("result = " + result);

    }
    //------------------------------------------Solution 2:-----------------------------------------
    public static void FINRA1() {

        String result = "";

        for(int i=1; i <= 30; i++) {

            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "     //Ternary : shortcut of If Statement

                    :(i%3 == 0) ? "FIN " : i+" ";

        }

        System.out.println(result);

    }


    //------------------------------------------Solution 3:-----------------------------------------

    public static void FINRA3() {

        String[] arr= new String[30];



        for( int i=0; i <= 29; i++ )

            arr[i] = ""+(i+1);



        for(int j=0; j<arr.length; j++)

            if(Integer.valueOf(arr[j])%3==0 && Integer.valueOf(arr[j])%5==0)

                arr[j]="FINRA";

            else if (Integer.valueOf(arr[j])%3==0)

                arr[j]="FIN";

            else if (Integer.valueOf(arr[j])%5==0)

                arr[j]="RA";



        System.out.println(Arrays.toString(arr));

    }

}