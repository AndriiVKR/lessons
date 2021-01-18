package hw16;

public class Main {
    public static void main(String[] args) {

        Candidate candidate1 = new Candidate("Ivan", "Ivanov", 400);
        Candidate candidate2 = new Candidate("Petr", "Petersson", 200);
        Candidate candidate3 = new Candidate("Grigory", "Grigorov", 250);

        Candidate[] array = new Candidate[] {candidate1, candidate2, candidate3};

        Commission commission = new Commission();

//        commission.verify1(candidate1);
//        commission.verify1(candidate2);
//        commission.verify1(candidate3);

//        commission.verify2(array);

//        int a = commission.verify3(array);
//
//        System.out.println(a);

        String[] array1 = new String[] {"Hello", "a", "hi", "hi or Hello", "ss", "jj "};

//        int b = commission.met1(array1);
//        System.out.println(b);

        boolean[] array2 = new boolean[] {true, true, false, false, true, false, false};
        String res = commission.met3(array2);
        System.out.println(res);



    }
}
