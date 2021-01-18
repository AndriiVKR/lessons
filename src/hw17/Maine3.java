package hw17;

import java.util.ArrayList;

public class Maine3 {
    public static void main(String[] args) {

        Candidate cand1 = new Candidate("Ivan", "Petrov", 10, true);
        Candidate cand2 = new Candidate("Petr", "Ivanov", 15, false);
        Candidate cand3 = new Candidate("Grigory", "Grigoriev", 8, true);
        Candidate cand4 = new Candidate("Fedor", "Fedorov", 11, false);

        ArrayList<Candidate> array = new ArrayList<>();
        array.add(cand1);
        array.add(cand2);
        array.add(cand3);
        array.add(cand4);

        Commission com = new Commission();

//        com.verify1(array);
//        com.verify2(array);
//        com.verify3(array);
        com.verify4(array);
    }
}
