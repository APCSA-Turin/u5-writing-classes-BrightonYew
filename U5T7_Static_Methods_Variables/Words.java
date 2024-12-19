package U5T7_Static_Methods_Variables;

public class Words {

    private Words(){}

    public static boolean doesContain (String str1, String str2) {
        if (str2.indexOf(str1) > -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void printReverse (String str) {
        String finalString = "";
        int index = (str.length() - 1);
        while(index >= 0) {
            finalString += str.substring(index, index + 1);
            finalString += " ";
            index--;
        }
        System.out.println(finalString);
    }
}
