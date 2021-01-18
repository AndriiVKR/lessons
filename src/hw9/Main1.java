package hw9;

public class Main1 {
    public static void main(String[] args) {

        Fog fog1 = new Fog("fog1", 100, "2 in", 3);
        Fog fog2 = new Fog("fog2",120, "2,3 in", 4);

        System.out.println("I " + fog1.getName() + ", my weight is " + fog1.getWeight() + " , I have a size "
                + fog1.getSize() + ", and I can jump " + fog1.getJump() + " meters");
        System.out.println("I " + fog2.getName() + ", my weight is " + fog2.getWeight() + " , I have a size "
                + fog2.getSize() + ", and I can jump " + fog2.getJump() + " meters");

        fog1.setName("fog3");
        fog1.setWeight(150);
        fog1.setSize("3 in");
        fog1.setJump(5);
        System.out.println("I " + fog1.getName() + ", my weight is " + fog1.getWeight() + " , I have a size "
                + fog1.getSize() + ", and I can jump " + fog1.getJump() + " meters");

        fog2.setName("fog4");
        fog2.setWeight(200);
        fog2.setSize("5 in");
        fog2.setJump(6);
        System.out.println("I " + fog2.getName() + ", my weight is " + fog2.getWeight() + " , I have a size "
                + fog2.getSize() + ", and I can jump " + fog2.getJump() + " meters");



    }
}
