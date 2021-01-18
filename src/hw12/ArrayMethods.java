package hw12;

public class ArrayMethods {

    public void met1(int[] array ) {

        int storage = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = storage;
        for (int i = 0; i < array.length; i++) {
            int b = array[i];
            System.out.print(b + " ");
        }

    }

    public void met2(String[] array) {
        if (array[0].equals(array[array.length - 1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
