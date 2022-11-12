package Java_Interview_Coding_Tasks_SDET;

public class Numbers_Divide_Without_Operator {

    public static void main(String[] args) {

        int n1 =9;
        int n2 =2;
        divide(n1, n2);
        divide1(n1, n2);
        divide2(n1, n2);
    }

//------------------------------------------Solution 1:-----------------------------------------

    public static void divide(int num1, int num2) {

        if (num2 == 0) {

            System.out.println("Invalid Number ");

            return;  // its going out

        }


        int count = 0;

        while (num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println("number1" + " devid by " + "number2" + " is: " + count + " and remainder is " + num1);
    }

        //------------------------------------------Solution Mahdi First way:-----------------------------------------
        public static void divide1(int num1, int num2) {

            if(num2==0) {

         throw new RuntimeException("Invalid number divisor can not be Zero");

            }

            int count =0;

            while(num1 >= num2) {

                num1 -= num2;

                count++;

            }

            System.out.println("number1" + " devid by " + "number2" + " is: " + count + " and remainder is " + num1);



        }
    //------------------------------------------Solution Mahdi Second way:-----------------------------------------
    public static void divide2(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid number divisor can not be Zero");
            System.exit(0);

        }



        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println("number1" + " devid by " + "number2" + " is: " + count + " and remainder is " + num1);



    }








}
/*
Write a method that can divide two numbers without using division operator
 */