package hw19;

import java.util.ArrayList;

public class University {

    public  void verify1(ArrayList<Staff> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("My name is " + array.get(i).getFirstName() + array.get(i).getLastName() + " my age is "
                    + array.get(i).getAge());
        }
    }

    public void verify2(ArrayList<Staff> array) {
        int res = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getAge()>= 30) {
                res = res + 1;
                System.out.println("My name is " + array.get(i).getFirstName() + array.get(i).getLastName() + " my age is "
                        + array.get(i).getAge());
            }
        }
        System.out.println(" total is " + res);
    }
}
