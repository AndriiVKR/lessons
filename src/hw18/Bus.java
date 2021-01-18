package hw18;

public class Bus extends Vehicle {

    private int capacity;

    public Bus(String model, String color, int year, int capacity) {
        super("Liaz", "Yellow", 1980);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
