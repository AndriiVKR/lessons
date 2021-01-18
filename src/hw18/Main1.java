package hw18;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Red", 2020, 6);
        Bus bus1 = new Bus("Liaz", "yelov", 1980, 30);
        Motorcycle mot1 = new Motorcycle("Yamaha", "white", 2019, false);

        ArrayList<Vehicle> array = new ArrayList<>();
        array.add(car1);
        array.add(bus1);
        array.add(mot1);

        for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getModel() + " " + array.get(i).getColor() + " " + array.get(i).getYear());
        }
    }
}
