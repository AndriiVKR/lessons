package hw19;

public class Teacher extends Staff {

    private int exp;

    public Teacher(String firstName, String lastName, int age, int exp) {
        super(firstName, lastName, age);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

}
