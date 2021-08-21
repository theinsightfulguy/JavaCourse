package vehicles;

public interface Vehicle {
    void move();
    void stop();
}

interface VehicleWithWheels extends Vehicle {
    int numberOfWheels();
}

interface VehicleWithEngine extends Vehicle {
    Engine engine();
}

interface VehicleWithTransmission extends Vehicle {
    boolean isAutomatic();
}

interface LandVehicle extends Vehicle {

}

abstract class AbstractCar implements VehicleWithEngine, VehicleWithTransmission, LandVehicle, VehicleWithWheels {
    Color color;
    double weight;
    final int numDoors;
    final int passengerCapacity;
    final String carModel;

    public AbstractCar(final int numDoors, final int passengerCapacity, String carModel) {
        this.numDoors = numDoors;
        this.passengerCapacity = passengerCapacity;
        this.carModel = carModel;
    }

    public abstract void setColor(Color c);

    public abstract void setWeight(double weight);

    public int calculateWeight() {
        return 1000 * numDoors;
    }
}

class BMWCar extends AbstractCar {

    private final boolean automatic;
    private final Engine engine;

    public BMWCar(int numDoors, int passengerCapacity, boolean automatic, String carModel, Engine engine) {
        super(numDoors, passengerCapacity, carModel);
        this.engine= engine;
        this.automatic = automatic;
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("vroooom");
    }

    @Override
    public void stop() {
        System.out.println("screeeech");
    }

    @Override
    public boolean isAutomatic() {
        return automatic;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public Engine engine() {
        return this.engine;
    }

//    @Override
//    public void finalize() {
//        System.out.println("Recycling this car");
//    }
}

class BMWX3 extends BMWCar {

    public BMWX3(boolean automatic, Color color) {
        super(4, 5, automatic, "X3", new V6Engine());
        this.setColor(color);
    }

    @Override
    public void move() {
        System.out.println("Your car is now moving");
    }

    @Override
    public void stop() {
        System.out.println("Your car is now stopping");
    }
}

class BMWX5 extends BMWCar {
    public BMWX5(boolean automatic, Color color, int passengerCapacity) {
        super(4, passengerCapacity, automatic, "X5", new V8Engine());
        this.setColor(color);
    }

    @Override
    public void move() {
        System.out.println("Your 2021 BMW X5 is now moving");
    }

    @Override
    public void stop() {
        System.out.println("Your 2021 BMW X5 is now stopping");
    }
}

class AudiQ5 extends AbstractCar {

    private final Engine engine = new V6Engine();
    public AudiQ5(Color color) {
        super(4, 5, "Q5");
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Audi Q5 moving now");
    }

    @Override
    public void stop() {
        System.out.println("Audi Q5 stopping now");
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public void setColor(Color c) {
        throw new RuntimeException("Cannot change color after manufacturing!!");
    }

    @Override
    public void setWeight(double weight) {
        throw new RuntimeException("Cannot change weight after manufacturing!!");
    }

    @Override
    public Engine engine() {
        return this.engine;
    }
}

enum Color {
    VIOLET(7), INDIGO(6), BLUE(5), GREEN(4), YELLOW(5), ORANGE(3), RED(2), AUDIBLUE(1);

    private int colorNumber;

    Color(int color) {
        this.colorNumber = color;
    }
}

//interface Color {
//}
//
////TODO: Why do I need to instantiate new Colors? Can I have a single Color Instance?
//final class Violet implements Color {
//
//    @Override
//    public String toString() {
//        return "Violet";
//    }
//
//}
//
//final class Indigo implements Color {
//
//    @Override
//    public String toString() {
//        return "Indigo";
//    }
//}
//
//final class Blue implements Color {
//
//    @Override
//    public String toString() {
//        return "Blue";
//    }
//
//}
//
//final class Green implements Color {
//
//    @Override
//    public String toString() {
//        return "Green";
//    }
//}
//
//final class Yellow implements Color {
//
//    @Override
//    public String toString() {
//        return "Yellow";
//    }
//}
//
//final class Orange implements Color {
//
//    @Override
//    public String toString() {
//        return "Orange";
//    }
//}
//
//final class Red implements Color {
//
//    @Override
//    public String toString() {
//        return "Red";
//    }
//}
//
//final class AudiBlue implements Color {
//
//    @Override
//    public String toString() {
//        return "Indigo";
//    }
//}