package hw18;

public class Motorcycle extends Vehicle {

    private boolean isSidecar;

    public Motorcycle(String madel, String color, int year, boolean isSidecar) {
        super("Yamaha", "Black", 2019);
        this.isSidecar = isSidecar;
    }

    public boolean getIsSidecar() {
        return isSidecar;
    }
}
