package hw20;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Application apply(String text) {
        Application apl = new Application(text);
        return apl;
    }
}
