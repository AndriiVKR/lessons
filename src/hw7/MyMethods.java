package hw7;

public class MyMethods {

    public void m1 () {
        System.out.println("Hello world");
    }

    public void m2 (String str) {
        System.out.println(str);
    }

    public void m3 (int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    public void m4 (String a, String b) {
        if (a.equals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
