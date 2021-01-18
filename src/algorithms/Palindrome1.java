package algorithms;

public class Palindrome1 {

    public static boolean isPalindrome1(int a) {

        boolean res = false;
        String b = Integer.toString(a);
        char[] array = b.toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-1-i]) {
                    res = false;
                    return res;
            }
        }
        res = true;
        return res;

    }
}
