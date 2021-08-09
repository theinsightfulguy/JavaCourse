package vehicles;

public interface Vehicle {
    void move();

    void stop();
}

interface VehicleWithWheels extends Vehicle {
    int numberOfWheels();
}

interface VehicleWithEngine extends Vehicle {
    int horsePower(); //TODO: Not very well encapsulated

    int torque();
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

    private final int horsePower;
    private final int torque;
    private final boolean automatic;

    public BMWCar(int numDoors, int passengerCapacity, int horsePower, int torque, boolean automatic, String carModel) {
        super(numDoors, passengerCapacity, carModel);
        this.horsePower = horsePower;
        this.torque = torque;
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
    public int horsePower() {
        return horsePower;
    }

    @Override
    public int torque() {
        return torque;
    }

    @Override
    public boolean isAutomatic() {
        return automatic;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

//    @Override
//    public void finalize() {
//        System.out.println("Recycling this car");
//    }
}

class BMWX3 extends BMWCar {

    public BMWX3(boolean automatic, Color color) {
        super(4, 5, 340, 1000, automatic, "X3");
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
        super(4, passengerCapacity, 400, 1000, automatic, "X5");
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
    public int horsePower() {
        return 240;
    }

    @Override
    public int torque() {
        return 800;
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
}

interface Color {
}

//TODO: Why do I need to instantiate new Colors? Can I have a single Color Instance?
final class Violet implements Color {

    @Override
    public String toString() {
        return "Violet";
    }

}

final class Indigo implements Color {

    @Override
    public String toString() {
        return "Indigo";
    }
}

final class Blue implements Color {

    @Override
    public String toString() {
        return "Blue";
    }

}

final class Green implements Color {

    @Override
    public String toString() {
        return "Green";
    }
}

final class Yellow implements Color {

    @Override
    public String toString() {
        return "Yellow";
    }
}

final class Orange implements Color {

    @Override
    public String toString() {
        return "Orange";
    }
}

final class Red implements Color {

    @Override
    public String toString() {
        return "Red";
    }
}

final class AudiBlue implements Color {

    @Override
    public String toString() {
        return "Indigo";
    }
}