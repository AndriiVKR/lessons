package hw3;

public class Main {
    public static void main(String[] args) {

        Client cl1 = new Client("John ", "Smith", 34, true);
        Client cl2 = new Client("Ivan", "Ivanov",20, false);
        Client cl3 = new Client("Petr", "Petrov", 27, true);
        Client cl4 = new Client("Stephan", "Stephanov", 23, false);

        cl1.sum(9, 50);
        cl2.sum(87, 21);
        cl3.sum(2, 2);
        cl4.sum(34, 45);

        cl1.introduce();
        cl2.introduce();
        cl3.introduce();
        cl4.introduce();

    }

}
