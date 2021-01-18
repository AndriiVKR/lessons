package hw9;

public class Main {
    public static void main(String[] args) {


        Mouse mo1 = new Mouse();
        mo1.setColor("White");
        mo1.setAge(2);
        mo1.setSize("4");
        System.out.println("I'm mouse " + "i have " + mo1.getColor() + " color," + " I'm " + mo1.getAge() +
                " old, and my " + "long is " + mo1.getSize() + " in");


        Mouse mo2 = new Mouse();
        mo2.setColor("black");
        mo2.setAge(4);
        mo2.setSize("1,5");
        System.out.println("I'm mouse " + "i have " + mo2.getColor() + " color," + " I'm " + mo2.getAge() +
                " old, and my " + "long is " + mo2.getSize() + " in");


        Mouse mo3 = new Mouse();
        mo3.setColor("grey");
        mo3.setAge(3);
        mo3.setSize("1,8");
        System.out.println("I'm mouse " + "i have " + mo3.getColor() + " color," + " I'm " + mo3.getAge() +
                " old, and my " + "long is " + mo3.getSize() + " in");


    }
}
