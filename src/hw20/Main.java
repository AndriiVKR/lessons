package hw20;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");

        Application app1 = new Application("Some information");

        Application res = cat1.apply("My resume");
        System.out.println(res.getText());

        Application som = cat1.apply("Something");
        System.out.println(som.getText());


    }
}
