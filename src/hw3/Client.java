package hw3;

public class Client {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isDriverLicence;

    public Client(String firstName, String lastName, int age, boolean isDriverLicence){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isDriverLicence = isDriverLicence;
    }

    public void introduce() {
        System.out.println("My name is " + firstName + " " + " My age is " + " " + age);
    }

    public void sum(int x, int y) {
        int c = x +y;
        System.out.println(c);
    }

}
