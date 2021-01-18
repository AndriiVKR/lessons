package hw10;

public class Commission {

    public void exam (int age, boolean isDiploma, String firsName, String lastName) {
        if (age >= 16 && isDiploma == true) {
            System.out.println("Welcome to exam " + firsName + " " + lastName);
        } if (age < 16) {
            System.out.println("Sorry, you need to grow up a little bit " + firsName + " " + lastName);
        } if (age >= 16 && isDiploma == false) {
            System.out.println("Sorry, you need to graduate your diploma " + firsName + " " + lastName);
        }
    }
}
