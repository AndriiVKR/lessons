package hw6;

public class Main {
    public static void main(String[] args) {

        Dancer dan1 = new Dancer("John", "Petrov", 49);
        Dancer dan2 = new Dancer("ivan", "Ivanov", 20);
        Dancer dan3 = new Dancer("Fedor", "Fedorov", 30);
        Dancer dan4 = new Dancer("Alex", "Alexandrov", 25);

        Administrator adm = new Administrator();

        adm.verify1(dan1.getAge(), dan1.getFirstName());
        adm.verify1(dan2.getAge(), dan2.getFirstName());
        adm.verify1(dan3.getAge(), dan3.getFirstName());
        adm.verify1(dan4.getAge(), dan4.getFirstName());

    }

}
