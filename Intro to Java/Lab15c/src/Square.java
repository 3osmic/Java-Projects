/**
 * Square
 *
 * @author Aliyah Lewis
 *
 */

public class Square extends GeometricObject implements Colorable {
    private double side;

    /**
     * Constructs a square with its side
     *
     * @param side | The square's side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Gets the square's side
     *
     * @return side | The square's side
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets the new square's side
     *
     * @param side | The new square's side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Gets the square's area
     *
     * @return side * side | The square's area
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Gets the square's perimeter
     *
     * @return 4 * side | The aquare's perimeter
     */
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    /**
     * Implements the howToColor method
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
