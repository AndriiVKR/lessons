package hw15;

public class Main {

    public static void main(String[] args) {

        Teacher teach1 = new Teacher("ivanov", 7,100);
        Teacher teach2 = new Teacher("Petrov", 3, 70);
        Teacher teach3 = new Teacher("Sidorov", 4, 80);
        Teacher teach4 = new Teacher("Grigiriev", 2, 50);

        Teacher[] array = new Teacher[] {teach1, teach2, teach3, teach4};

        Admin adm = new Admin();
//        adm.verify(array);

//        adm.verify1(array);




    }
}
