package hw17part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Athletes ath1 = new Athletes("John", "Jonson", 22, 95);
        Athletes ath2 = new Athletes("Nik", "Nokolson", 17, 93);
        Athletes ath3 = new Athletes("Viktor", "Prilepin", 24,97);
        Athletes ath4 = new Athletes("Boris", "Ivanov", 20, 64);

        ArrayList<Athletes> array = new ArrayList<>();
        array.add(ath1);
        array.add(ath2);
        array.add(ath3);
        array.add(ath4);

        Commission com = new Commission();

//        com.verify1(array);
//        com.verify2(array);
        com.verify3(array, "John");
    }
}
