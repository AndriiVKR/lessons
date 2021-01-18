package hw6;

public class Administrator {

    public void verify1(int age, String firstName) {
        if (age >= 23) {
            System.out.println("Welcome to club " + firstName);
        } else {
            System.out.println("Go home " + firstName);
        }
    }

}
