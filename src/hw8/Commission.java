package hw8;

public class Commission {

    public void verifyMale(int height, String eyesColor) {
        if ( height >= 180 && eyesColor.equals("blue")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry, next time");
        }
    }

    public void verifyFemale(int height, String hairColor) {
        if (height >= 175 && hairColor.equals("blond")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry, next time");
        }

    }
}
