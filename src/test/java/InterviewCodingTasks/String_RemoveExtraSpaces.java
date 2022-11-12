package InterviewCodingTasks;

public class String_RemoveExtraSpaces {

    /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java

     */
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        System.out.println("removeExtraSpace(str) = " + removeExtraSpace(str));
    }

    public static String removeExtraSpace(String str) {

        String[] words = str.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

        return result.trim();

    }


}
