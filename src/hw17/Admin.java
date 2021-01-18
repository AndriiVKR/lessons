package hw17;

import java.util.ArrayList;

public class Admin {

    public void verify1(ArrayList<Cat> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getAge() + array.get(i).getName());
        }
    }

    public void verify2(ArrayList<Cat> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getName().equals("Vaska")) {
                array.get(i).setAge(array.get(i).getAge() + 4);
            } else {
                array.get(i).setAge(array.get(i).getAge() - 2);
            }
            System.out.println(array.get(i).getName() + " " + array.get(i).getAge());
        }

    }


}
