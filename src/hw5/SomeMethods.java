package hw5;

public class SomeMethods {

        public void sum3Numbers(int a, int b, int c) {
            int result = a + b + c;
            System.out.println(result);
        }

        public void minus2Numbers(int x, int y) {
            int result1 = x - y;
            System.out.println(result1);
        }

        public void multiply3Numbers (int a, int b, int c) {
            int result2 = a * b * c;
            System.out.println(result2);
        }

        public void words(String str1, String str2) {
            if (str1.equals(str2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        public int sumRes(int a, int b) {
            int result = a - b;
            return result;
        }

        public int twoNumbers (int a, int b) {

            if (a > b) {
                return b;
            } else {
                return a;}

        }
}
