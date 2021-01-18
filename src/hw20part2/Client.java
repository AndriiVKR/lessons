package hw20part2;

public class Client {

    public double amount;
    private String firsName;
    private String lastName;

    public Client(String firstName, String lastName) {
        this.firsName = firstName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }
}
