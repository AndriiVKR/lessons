package hw8;

public class Main {
    public static void main(String[] args) {

       Male m1 = new Male(190, "blue");
       Male m2 = new Male (177, "grey");

       Female f1 = new Female("blond", 175);
       Female f2 = new Female("red", 188);

       Commission com = new Commission();

       com.verifyMale(m1.getHeight(), m1.getEyesColor());
       com.verifyMale(m2.getHeight(), m2.getEyesColor());

       com.verifyFemale(f1.getHeight(), f1.getHairColor());
       com.verifyFemale(f2.getHeight(), f2.getHairColor());

    }


}
