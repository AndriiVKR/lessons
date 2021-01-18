package hw19part2;

public class Dog extends Pet{

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void words(String a, String b) {
         if (a.equals(b)) {
             System.out.println("Yes");
        } else {
             System.out.println("No");
         }
    }
}
