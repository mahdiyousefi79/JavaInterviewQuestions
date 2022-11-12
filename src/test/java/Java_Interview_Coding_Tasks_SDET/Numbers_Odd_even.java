package Java_Interview_Coding_Tasks_SDET;

public class Numbers_Odd_even {
    public static void main(String[] args) {

        System.out.println("identifyOddEven(5) = " + identifyOddEven(5));

        System.out.println("identifyOddEven(6) = " + identifyOddEven(6));



    }


    public static String   identifyOddEven(int n){


        return (n % 2==0)? "even" : "odd";                 //Ternary : shortcut of If Statement


    }
}
