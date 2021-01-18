package hw12;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[5];

        array1[0] = 7;
        array1[1] = 5;
        array1[2] = 4;
        array1[3] = 0;
        array1[4] = 2;

        ArrayMethods methods = new ArrayMethods();
//        methods.met1(array1);

        String[] array2 = new String[4];

        array2[0] = "A";
        array2[1] = "B";
        array2[2] = "c";
        array2[3] = "d";

        methods.met2(array2);


//        if (array1[0] > array1[4]) {
//            System.out.println(array1[0] + " max");
//        } else {
//            System.out.println(array1[4] + " max");
//        }

//        int size1 = array1.length;
//        System.out.println(size1);

        int a = array1[array1.length - 1];
//        System.out.println(a);

//        int storage1 = array1[0];
//        array1[0] = array1[array1.length - 1];
//        array1[array1.length - 1] = storage1;
//        for (int i = 0; i < array1.length; i++) {
//            int b = array1[i];
//            System.out.print(b);
//        }






    }
}
