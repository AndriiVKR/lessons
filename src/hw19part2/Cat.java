package hw19part2;

public class Cat extends Pet{

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void sum(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}
