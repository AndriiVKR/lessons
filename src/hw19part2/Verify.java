package hw19part2;

import java.util.ArrayList;

public class Verify {

    public void verify1(ArrayList<Pet> array) {
        for (int i = 0; i < array.size(); i++ ) {
            System.out.println("My name is " + array.get(i).getName() + " my age is " + array.get(i).getAge());
        }
    }

    public void verify2(ArrayList<Pet> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getName().equals("Barsik")) {
                System.out.println(array.get(i).getAge());
            }
        }
    }
}
