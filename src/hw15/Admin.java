package hw15;

public class Admin {

    public void verify(Teacher[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getExperience() > 5) {
                array[i].setSalary(array[i].getSalary() * 2);
                System.out.println("Congratulation, " + array[i].getLastName() + " your salary is " + array[i].getSalary());
            } else {
                System.out.println("Sorry, " + array[i].getLastName() + " Next time");
            }
        }
    }

    public void verify1(Teacher[] array) {
        int exp1 = 0;
        int exp2 = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i].getExperience() < 5 ) {
                exp1 = exp1 + 1;
            }
        }
        System.out.println(exp1);
    }

}
