package Java_Interview_Coding_Tasks_SDET.Amazon;

public class Location_of_a_word_within_String_of_word {

    //Write a method that will print out the locations of a word within a string of words.
    // NOTE: If this is too challenging for the QAE-2, then have them locate the first location of the word within the string


    public static void main(String[] args) {
        String text = "0123hello9012hello8901hello7890";
        String match = "hello";
        findWord(text,match);

        System.out.println("---------------------------------");
        String text1 = "I learn Java, I like Java and use Java";
        String match1 = "Java";

        findWord(text1,match1);

    }

     public static void findWord(String inputString, String searchWord){


         int i = inputString.indexOf(searchWord);

         while (i >= 0) {  // indexOf returns -1 if no match found
             System.out.println(i);
             i = inputString.indexOf(searchWord, i + searchWord.length());
         }
     }
}
