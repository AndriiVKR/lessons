package hw19part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 3, "red");
        Cat cat2 = new Cat("Murzik", 2, "black");

        Dog dog1 = new Dog("Barsik", 5, "volf");
        Dog dog2 = new Dog("Muhtar", 1, "ovcharka");

        ArrayList<Pet> array = new ArrayList<>();
        array.add(cat1);
        array.add(cat2);
        array.add(dog1);
        array.add(dog2);

        Verify ver = new Verify();
//        ver.verify1(array);
//        ver.verify2(array);
        cat1.sum(3, 4);

        dog2.words("r", "e");
    }
}
