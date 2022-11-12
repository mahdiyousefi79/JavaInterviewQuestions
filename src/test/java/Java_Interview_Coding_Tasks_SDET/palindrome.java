package Java_Interview_Coding_Tasks_SDET;

public class palindrome {
    public static void main(String[] args) {
        String[] arr = {"ali", "madam", "mahdi", "racecar", "book","ada"};
        printPalindrome(arr);
        System.out.println("-------------------");
        printPalindrome1(arr);
    }

    public static void printPalindrome(String[] arr) {
        for (String each : arr) {
            if (each.equals(reverse(each))){
                System.out.println(each);
            }
        }
    }

    public static String reverse(String str){
        String rev = "";
        for (int i=str.length()-1; i>=0 ; i--){
            rev+= str.charAt(i);
        }
        return rev;
    }

    public static void printPalindrome1(String[] arr) {
        for (String each : arr) {
            String rev = "";
            for (int i=each.length()-1; i>=0 ; i--){
                rev+= each.charAt(i);
            }
            if (each.equals(rev)){
                System.out.println(each);
            }
        }
    }
}
