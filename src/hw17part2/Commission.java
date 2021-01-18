package hw17part2;

import java.util.ArrayList;

public class Commission {

    public void verify1(ArrayList<Athletes> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Hi my name is " + array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                    " , I'm " + array.get(i).getAge() + " years olg, and my weight is " + array.get(i).getWeight());
        }
    }

    public void verify2(ArrayList<Athletes> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getAge() >= 20 && array.get(i).getWeight() >= 70) {
                System.out.println("Welcome to competition " + array.get(i).getFirstName() + " "
                        + array.get(i).getLastName());
            } else {
                System.out.println("Sorry, go home " + array.get(i).getFirstName() + " " + array.get(i).getLastName());
            }
        }
    }

    public void verify3(ArrayList<Athletes> array, String firstName) {
        String result = null;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getFirstName().equals(firstName)) {
                result = array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                        " , I'm " + array.get(i).getAge() + " years olg, and my weight is " + array.get(i).getWeight();
            } else result = "Sorry, we did not find your athlete";
            }
        System.out.println(result);
        }
    }
