package geometry;

public class BadRectangle extends Rectangle{

    public BadRectangle(int width, int height) {
        super(width, height);
        System.out.println("Created Bad Rectangle");
    }

    @Override
    public int computePerimeter() {
        //return -10;
        return super.computePerimeter();
    }
}
