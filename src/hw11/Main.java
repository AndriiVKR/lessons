package hw11;

public class Main {
    public static void main(String[] args) {

        String[] array1 = new String[7];

        array1[0] = "A";
        array1[1] = "B";
        array1[2] = "C";
        array1[3] = "D";
        array1[4] = "E";
        array1[5] = "F";
        array1[6] = "G";

//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);
//        System.out.println(array1[4]);
//        System.out.println(array1[5]);
//        System.out.println(array1[6]);

        int[] array2 = new int[4];
        array2[0] = 20;
        array2[1] = 88;
        array2[2] = 22;
        array2[3] = 10;
         if (array2[0] > array2[3]) {
             System.out.println(array2[0]);
         } else {
             System.out.println(array2[3]);
         }

         boolean[] array3 = new boolean[3];
         array3[0] = true;
         array3[1] = false;
         array3[2] = true;

        System.out.println(array3[0]);
        System.out.println(array3[1]);
        System.out.println(array3[2]);


    }
}
