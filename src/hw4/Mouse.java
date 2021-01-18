package hw4;

public class Mouse {

    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep () {
        System.out.println("I'm sleeping " + name );
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }





}