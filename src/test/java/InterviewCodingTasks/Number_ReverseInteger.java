package InterviewCodingTasks;

public class Number_ReverseInteger {

    public static void main(String[] args) {
        int num =297645;

        System.out.println("reverse(num) = " + reverse(num));
        System.out.println("reverse1(num) = " + reverse1(num));
    }

// ----------------------------Mahdi -----------------------
public static int reverse(int num) {

    String result = "";
    String str = String.valueOf(num);


    for (int i=str.length()-1;i>=0; i--){
        result += str.charAt(i);
    }

    return Integer.parseInt(result);
}

//------------------------------------------------------------------------------------------

 /* Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4

Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50

Dividing an integer by 10 will remove the rightmost digit. (75 / 10) = 7
  */

    public  static int reverse1(int number){
        if(number < 10 && number >= 0){  //0-9
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
}
