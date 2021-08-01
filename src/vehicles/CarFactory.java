package vehicles;

public class CarFactory {
    public static void main(String... args) {
        BMWCar car = new BMWCar(4,5,500,600, false, "M5");
        BMWCar car2 = new BMWCar(2, 2, 250, 300, true, "Z4");

        car.color = new Blue();
        car.weight = 3000;

        car2.color = new Red();
        car2.weight = 5000;

        car.move();
        car.stop();

    }
}
