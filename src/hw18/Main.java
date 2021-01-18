package hw18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(9);
        array.add(44);
        array.add(2);
        int max = array.get(0);
        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
                index = i;
            }
        }
        System.out.println(max + " Index is " + index);
    }
}
