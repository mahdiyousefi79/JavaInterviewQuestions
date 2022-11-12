package InterviewCodingTasks;

public class String_ReverseSecondWord {

    /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */
    public static void main(String[] args) {
        String str = "I Love Java";
        System.out.println("passwordIsValid(str) = " + reverseSecondWord(str));
    }

    public static String reverseSecondWord(String str) {
        String[] words = str.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--){
            reversed += words[1].charAt(i);
        }

        words[1] = reversed;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }

        return result.trim();
    }

}
