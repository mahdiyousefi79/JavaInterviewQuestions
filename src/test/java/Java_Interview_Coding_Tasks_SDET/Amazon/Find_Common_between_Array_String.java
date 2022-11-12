package Java_Interview_Coding_Tasks_SDET.Amazon;

public class Find_Common_between_Array_String {

    public static void main(String[] args) {

        String[] arr1 = {"ABC", "ABD", "MNH", "MPL", "RST"};
        String[] arr2 = {"ABy", "ABD", "MNR", "MPE", "RST"};
        findCommon(arr1, arr2);

        System.out.println("--------------------------");
        String str1 = "ABCDEFG";
        String str2 = "RFSDTOHLG";
        findCommon1(str1, str2);
    }

    //-------------------------------- Mahdi ------------------------------------
    public static void findCommon(String[] str1, String[] str2) {
        for (String each : str1) {

            for (String each1 : str2) {

                if (each.equals(each1)) {
                    System.out.println(each);
                }
            }
        }
    }
    //---------------------------------------------------------------------------
    public static void findCommon1(String str1, String str2) {
        for (String each : str1.split("")) {
            if (str2.contains(each)) {
                System.out.println(each);
            }
        }
    }
}
