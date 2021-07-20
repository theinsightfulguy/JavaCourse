package geometry;

public interface Polygon extends Shape {
    /**
     *
     * @return number of sides
     */
    int getNumberOfSides();

    /**
     *
     * @return area of the regular polygon
     */
    int computeArea();
    int computePerimeter();
}
