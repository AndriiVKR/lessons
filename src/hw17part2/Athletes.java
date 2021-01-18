package hw17part2;

public class Athletes {

    private String firstName;
    private String lastName;
    private int age;
    private int weight;

    public Athletes(String firstName, String lastName, int age, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
