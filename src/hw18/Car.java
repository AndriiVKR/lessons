package hw18;

public class Car extends Vehicle{

    private int timeSpeed;

    public Car(String model, String color, int year, int timeSpeed) {
        super(model, color, year);
        this.timeSpeed = timeSpeed;
    }

    public int getTimeSpeed() {
        return timeSpeed;
    }

    public void setTimeSpeed(int timeSpeed) {
        this.timeSpeed = timeSpeed;
    }

}
