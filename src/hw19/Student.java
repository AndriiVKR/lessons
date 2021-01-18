package hw19;

public class Student extends Staff {

    private int ball;

    public Student(String firstName, String lastName, int age, int ball) {
        super(firstName,lastName,age);
        this.ball = ball;
    }

    public int getBall() {
        return ball;
    }
}
