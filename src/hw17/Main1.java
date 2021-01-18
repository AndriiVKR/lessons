package hw17;

import java.util.ArrayList;

public class Main1 {


    public static void main(String[] args) {

        Cat cat1 = new Cat("Vaska", 2);
        Cat cat2 = new Cat("Murzik", 3);
        Cat cat3 = new Cat("Pushok", 4);

        ArrayList<Cat> array1 = new ArrayList<>();
        array1.add(cat1);
        array1.add(cat2);
        array1.add(cat3);

        Admin adm = new Admin();
        adm.verify1(array1);

        adm.verify2(array1);


    }
}
