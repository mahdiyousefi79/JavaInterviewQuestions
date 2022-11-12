package Java_Interview_Coding_Tasks_SDET;

import java.util.ArrayList;
import java.util.List;

public class Numbers_Divisible_By3_5_15 {

    public static void main(String[] args) {

        main();
        div3_5_15(100);
    }

    //------------------------------------------Solution 1:-----------------------------------------
    public static void main(){


        String divisibleBy15 ="";

        String divisibleBy5 ="";

        String divisibleBy3="";


        int[] arr = new int[100];

        for(int i=0; i <= arr.length-1; i++)

            arr[i] = i+1;



        for (int each : arr) {

            if (each % 3 == 0 && each % 5 == 0 && each % 15 == 0) {
                divisibleBy15 += each + " ";



            } else if (each % 5 == 0) {

                divisibleBy5 += each+" ";

            } else if (each % 3 == 0) {

                divisibleBy3 += each+" ";
            }
        }

            System.out.println("divisibleBy15 = " + divisibleBy15);
            System.out.println("divisibleBy5 = " + divisibleBy5);
            System.out.println("divisibleBy3 = " + divisibleBy3);


        }

//------------------------------------------Solution 2:-----------------------------------------

    public static void main1(String[] args) {

        String divisibleBy15 ="";

        String divisibleBy5 ="";

        String divisibleBy3="";

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < 100; i++)

            list.add(i+1);



        for(int each: list) {

            if(each %15==0 && each %3==0)

                divisibleBy15+= each+" ";

            if(each %5==0 && each % 15!=0)

                divisibleBy5 += each+" ";

            if(each%3==0 && each %15!=0)

                divisibleBy3 += each+" ";

        }

        System.out.println("Divisible By 15: "+divisibleBy15);

        System.out.println("Divisible By 5: "+divisibleBy5);

        System.out.println("Divisible By 3: "+divisibleBy3);

    }


//------------------------------------------Solution 3- best one:-----------------------------------------




    public static void main3(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < 100; i++)

            list.add(i+1);



        System.out.print("Divisible By 15: ");

        list.forEach( p -> { if(p%15==0 && p%3==0) System.out.print(p+" "); } ) ;

        System.out.print("\nDivisible By 5: ");

        list.forEach( p -> { if(p%5==0 && p%15!=0) System.out.print(p+" "); } ) ;

        System.out.print("\nDivisible By 3: ");

        list.forEach( p -> { if(p%3==0 && p%15!=0) System.out.print(p+" "); } ) ;

    }
// ----------------------------------------------Mahdi ----------------------------------
    public static void div3_5_15(int n) {
        String divisibleBy15 = "";

        String divisibleBy5 = "";

        String divisibleBy3 = "";

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i% 15 !=0  ) {
                divisibleBy3 += i + " ";

            }
            if (i % 5 == 0 && i% 15 !=0 ) {
                divisibleBy5 += i + " ";
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibleBy15 += i+" ";
            }
        }
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy15 = " + divisibleBy15);
    }




}
/*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

ex:

OutPut:

Divisible By 15 15 30 45 60 75 90

Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100

Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99


 */