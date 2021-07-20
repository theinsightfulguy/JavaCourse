package geometry;

public abstract class PartiallyDefinedPolygon implements Polygon {

    private int numSides;

    public PartiallyDefinedPolygon(int sides) {
        System.out.println("Creating Partially Defined Rectangle");
        int numSides = sides;
    }

    @Override
    public final int getNumberOfSides() {
        return numSides;
    }

    @Override
    public int computePerimeter() {
        return 0;
    }
}
