package hw17;

public class Candidate {

    private String firstName;
    private String lastName;
    private int exp;
    private boolean isDiploma;

    public Candidate(String firstName, String lastName, int exp, boolean isDiploma) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exp = exp;
        this.isDiploma = isDiploma;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getExp() {
        return exp;
    }
    public boolean getIsDiploma() {
        return isDiploma;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
