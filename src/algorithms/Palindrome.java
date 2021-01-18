package algorithms;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        boolean result = false;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-1-i]) {
                result = false;
                return result;
            }
        }
        result = true;
        return result;


    }
}
