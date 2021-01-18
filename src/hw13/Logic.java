package hw13;

public class Logic {

    public void log1(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
    }

    public void log2() {
        for (int i = 0; i < 157; i = i+2) {
            System.out.println(i);
        }
    }

    public void log3() {
        for(int i = 1; i <= 157; i = i + 2) {
            System.out.println(i);
        }
    }

    public void log4() {
        for(int i = 0; i < 227; i = i +3) {
            System.out.println(i);
        }
    }

    public void log5(int a, int b, int c) {
        for(int i = a; i <= b; i = i + c) {
            System.out.println(i);
        }
    }
}
