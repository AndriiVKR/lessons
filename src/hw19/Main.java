package hw19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Teacher teach1 = new Teacher("John", "Jonson", 35, 15);
        Teacher teach2 = new Teacher("Bob", "Bobovsky",27, 5);

        Student st1 = new Student("Ivan", "Ivanov", 19, 4);
        Student st2 = new Student("Fedor", "Fedorov", 20, 3);

        Worker wor1 = new Worker("Grigory", "Grigoriev", 40, 3000);
        Worker wor2 = new Worker("Alex", "Alexov", 43, 3500);

        ArrayList<Staff> array = new ArrayList<>();
        array.add(teach1);
        array.add(teach2);
        array.add(st1);
        array.add(st2);
        array.add(wor1);
        array.add(wor2);

        University uni = new University();
//        uni.verify1(array);
        uni.verify2(array);

    }
}
