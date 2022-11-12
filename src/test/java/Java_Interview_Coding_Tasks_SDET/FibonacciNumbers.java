package Java_Interview_Coding_Tasks_SDET;

public class FibonacciNumbers {



    //     0,1,2,3,5,8,13,21
    //       j z
    public static void main(String[] args) {

        System.out.println("fib(n) = " + fib(3));
    }

    public static int fib(int num) {

        //1,1,2,3,5,8,13,21,...
        //J z

        //1 ---> 1
        //2----> 2
        //3----> 2
        //5----> 5
        //8----> 21


        int j = 0;
        int z = 1;
        int result = 0;

        if (num < 2)
            result = 1;

        for (int i = 2; i <= num; i++) {
            result = j + z;
            j = z;
            z = result;
        }
        return result;
    }
}