package hw2;

public class Main {
    public static void main(String[] args) {
        String word = "I learn Selenium";
        int a = 90;
        int b = 54;

        if (word.contains("Java")) {
            int result = a + b;
            System.out.println(result);
        } else {
            int result1 = a - b;
            System.out.println(result1);
        }
    }
}
