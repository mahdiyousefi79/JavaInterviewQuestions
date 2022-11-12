package Java_Interview_Coding_Tasks_SDET;

public class P2_Longest_substring_share_by2Strings {
    public static void main(String[] args) {
        String str1 = "wonderful";
        String str2 = "fulsome"; //"flsome"
        System.out.println("getLongestCommonSubstring1(str1,str2) = " + getLongestCommonSubstring1(str1, str2));

    }

// ---------------------  way ---------------------------------
    public static int getLongestCommonSubstring1(String str1, String str2) {
        int max = 0;

        int[][] table = new int[str1.length()][str2.length()];   // Create 2D Array   dp = Dynamic Programing


        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {       // Any time finding match


                    if (i == 0 || j == 0) {                     // If they are in the first cell of matrix
                        table[i][j] = 1;

                    } else {                                    //If they are not at the first cell of matrix
                        table[i][j] = table[i - 1][j - 1] + 1;
                    }

                    max = Math.max(table[i][j], max);

//                    System.out.println(Arrays.deepToString(dp));
                }
            }
        }
        return max;
    }
}
/*
Bonus: Can you return the length of the longest substring shared by the two strings?
Example:
S1 = “wonderful”
S2 = “fulsome”
Both words share “ful”, so return 3

 */