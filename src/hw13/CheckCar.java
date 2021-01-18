package hw13;


public class CheckCar {

    public void check1(Car car) {
        if(car.getColor().equals("red") && car.getModel().equals("Vaz") && car.getYear()== 2019) {
            car.setColor("green");
        }
        System.out.println(car.getColor());
    }

}
