package hw4;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog ("gav", 3, true, "black");
        Dog dog2 = new Dog("gav1", 4, true, "red");
        Dog dog3 = new Dog("gav2", 5, false, "white");

//        dog1.sayName();
//        dog2.sayName();
//        dog3.sayName();
//
//        System.out.println(dog1.getName());
//        System.out.println(dog1.getAge());
//        System.out.println(dog1.getIsPet());
//        System.out.println(dog1.getColor());
//
//        System.out.println(dog2.getName());
//        System.out.println(dog2.getAge());
//        System.out.println(dog2.getIsPet());
//        System.out.println(dog2.getColor());
//
//        System.out.println(dog3.getName());
//        System.out.println(dog3.getAge());
//        System.out.println(dog3.getIsPet());
//        System.out.println(dog3.getColor());

        Mouse mouse1 = new Mouse("Mouse1", 2);
        Mouse mouse2 = new Mouse("Mouse2", 1);
        Mouse mouse3 = new Mouse("Mouse3", 3);

        System.out.println("My name is " + mouse1.getName() + ", my age is " + mouse1.getAge());
        mouse1.sleep();

        System.out.println("My name is " + mouse2.getName() + ", my age is " + mouse2.getAge());
        mouse2.sleep();

        System.out.println("My name is " + mouse3.getName() + ", my age is " + mouse3.getAge());
        mouse3.sleep();
    }
}
