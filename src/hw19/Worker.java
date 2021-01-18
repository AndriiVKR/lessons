package hw19;

public class Worker extends Staff {

    private int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        super(firstName,lastName,age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}
