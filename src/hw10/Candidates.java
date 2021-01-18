package hw10;

public class Candidates {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isDiploma;

    public Candidates(String firstName, String lastName, int age, boolean isDiploma) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isDiploma = isDiploma;
    }

    public String getFirstName() {
        return firstName;
    }
    public  String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean getIsDiploma() {
        return isDiploma;
    }


}

