package hw17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Hello");
        array1.add("Hi");
        array1.add("by");
        array1.add("Hello");
        array1.add("Java");

        int count = 0;
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i).equals("Hello")) {
                count = count + 1;
            }
        }
        System.out.println(count);


    }
}
