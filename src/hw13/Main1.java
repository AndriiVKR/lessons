package hw13;

public class Main1 {
    public static void main(String[] args) {

        Car car1 = new Car("Kamaz", 2020,"red");
        Car car2 = new Car("Vaz", 2019,"red");
        Car car3 = new Car("Luaz", 2010,"grey");
        Car car4 = new Car("Vaz", 2019,"blue");

        CheckCar checkCar = new CheckCar();

        checkCar.check1(car1);
        checkCar.check1(car2);
        checkCar.check1(car3);
        checkCar.check1(car4);

    }
}
