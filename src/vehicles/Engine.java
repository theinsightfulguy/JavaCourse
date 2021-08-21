package vehicles;

public interface Engine {
    int horsePower();
    int torque();
}

class V8Engine implements Engine {

    @Override
    public int horsePower() {
        return 450;
    }

    @Override
    public int torque() {
        return 500;
    }
}

class V6Engine implements Engine {

    @Override
    public int horsePower() {
        return 340;
    }

    @Override
    public int torque() {
        return 400;
    }
}