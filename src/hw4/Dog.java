package hw4;

public class Dog {
    private String name;
    private int age;
    private boolean isPet;
    private String color;

    public Dog(String name, int age, boolean isPet, String color) {
        this.name = name;
        this.age = age;
        this.isPet = isPet;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getIsPet() {
        return isPet;
    }
    public String getColor() {
        return color;
    }

    public void sayName () {
        System.out.println("My name is " +  getName());
    }


}
