package hw16;

public class Commission {

    public void verify1(Candidate candidate) {
        if (candidate.getWeight() > 300 || candidate.getLastName().contains("ov")) {
            System.out.println("Welcome " + candidate.getFirstName() + " " + candidate.getLastName() + " on TV ");
        } else {
            System.out.println("Sorry " + candidate.getFirstName() + " " + candidate.getLastName() + " see you next time");
        }
    }

    public void verify2(Candidate[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getLastName().contains("ov") || array[i].getWeight() > 300) {
                System.out.println("Welcome " + array[i].getFirstName() + " " + array[i].getLastName() + " on TV ");
            } else {
                System.out.println("Sorry " + array[i].getFirstName() + " " + array[i].getLastName() + " see you next time");
            }
        }
    }

    public int verify3(Candidate[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getLastName().contains("ov") || array[i].getWeight() > 300) {
                count = count + 1;
            }
        } return count;
    }

    public int met1(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i].contains("Hello")) {
                count = count + 1;
            }
        } return count;
    }

    public String met3(boolean[] array) {
        String str = " ";
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == true) {
                str = "True";
            } else {
                str = "False";
            }
        } return str;
    }

}
