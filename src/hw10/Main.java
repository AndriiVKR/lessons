package hw10;

public class Main {

    public static void main(String[] args) {


//        int[] array1 = new int[5];
//
//        array1[0] = 7;
//        array1[1] = 5;
//        array1[2] = 4;
//        array1[3] = 0;
//        array1[4] = 2;
//
//        if (array1[0] > array1[4]) {
//            System.out.println(array1[0] + " max");
//        } else {
//            System.out.println(array1[4] + " max");
//        }
//        int size1 =

        Candidates can1 = new Candidates("Ivan", "Ivanov", 15, true);
        Candidates can2 = new Candidates("Peter", "Petrov", 18, false);
        Candidates can3 = new Candidates("Fedor", "Fedorov", 15, false);
        Candidates can4 = new Candidates("John", "Johnovich", 20, true);
        Candidates can5 = new Candidates("Vlad", "Vladov", 25, false);

        Commission com = new Commission();

        com.exam(can1.getAge(), can1.getIsDiploma(), can1.getFirstName(), can1.getLastName());
        com.exam(can2.getAge(), can2.getIsDiploma(), can2.getFirstName(), can2.getLastName());
        com.exam(can3.getAge(), can3.getIsDiploma(), can3.getFirstName(), can3.getLastName());
        com.exam(can4.getAge(), can4.getIsDiploma(), can4.getFirstName(), can4.getLastName());
        com.exam(can5.getAge(), can5.getIsDiploma(), can5.getFirstName(), can5.getLastName());



    }
}
