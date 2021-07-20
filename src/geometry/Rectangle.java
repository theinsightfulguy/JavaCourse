package geometry;

public class Rectangle extends PartiallyDefinedPolygon {

    private int recWidth;
    private int recHeight;

    public Rectangle(int width, int height) {
        super(4);
        recHeight = height;
        recWidth = width;
        System.out.println("Created Rectangle");
    }

    @Override
    public int computeArea() {
        return recWidth * recHeight;
    }

    @Override
    public int computePerimeter() {
        return 2 * recHeight + 2 * recWidth;
    }
}
