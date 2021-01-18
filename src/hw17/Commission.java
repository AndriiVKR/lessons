package hw17;

import java.util.ArrayList;

public class Commission {

    public void verify1(ArrayList<Candidate> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getFirstName() + " " + array.get(i).getLastName() + " " +
                    array.get(i).getExp() + " " + array.get(i).getIsDiploma());
        }
    }

    public void verify2(ArrayList<Candidate> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getExp() >= 10 && array.get(i).getIsDiploma()==true) {
                System.out.println(array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                        " Congratulation you are hired");
            } if (array.get(i).getExp() < 10 && array.get(i).getIsDiploma()== true) {
                System.out.println(array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                        " Sorry, you need to get more experience for hire");
            }
            if (array.get(i).getExp() > 10 && array.get(i).getIsDiploma()==false) {
                System.out.println(array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                        " Sorry, you need to get diploma");
            }
        }
    }

    public void verify3(ArrayList<Candidate> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getExp() >= 10 && array.get(i).getIsDiploma() ==true) {
                System.out.println(array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                        " Congratulation you are hired");
            } if(array.get(i).getExp() >= 10 && array.get(i).getIsDiploma() == false) {
                array.get(i).setLastName("Jonson");
                System.out.println(array.get(i).getFirstName() + " " + array.get(i).getLastName() +
                        " Congratulation you are hired");
            }
        }
    }

    public void verify4(ArrayList<Candidate> array) {
        int maxAge = 0;
        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getExp() > maxAge) {
                maxAge = array.get(i).getExp();
                index = i;
            }
        }
        System.out.println(maxAge + " " + array.get(index).getFirstName());


    }
}
