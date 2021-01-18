package hw14;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {2, 4, 7, 9, 2, 1, 3 ,19, 38, 1};

        for (int i = 0; i < array.length; i ++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }

//        int count1 = 0;
//        int count2 = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 0) {
//                count1 = count1 + 1;
//            } else {
//                count2 = count2 + 1;
//            }
//        }
//        System.out.println(count1);
//        System.out.println(count2);
//        if(count1 > count2) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }


    }
}
