package hw15;

public class Teacher {
    private String lastName;
    private int experience;
    private int salary;

    public Teacher(String lastName, int experience, int salary) {
        this.lastName = lastName;
        this.experience = experience;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }
    public int getExperience() {
        return experience;
    }
    public int getSalary() {
        return salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
