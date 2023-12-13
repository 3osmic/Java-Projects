/**
 * Circle
 *
 * @author Aliyah Lewis
 *
 */

public class Circle extends GeometricObject {
	
  private double radius;

  /**Default constructor*/
  public Circle() {
    this(1.0);
  }

  /**
   * Constructs a circle with the radius
   * 
   * @param radius | The Circle radius
   */
  public Circle(double radius) {
    this(radius, "white", false);
  }

  /**
   * Constructs a circle with radius, filled, and color
   * 
   * @param radius | The Circle radius
   * @param color | The Circle color
   * @param filled | Whether the circle is filled or not
   */
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**
   * Returns the Circle radius
   * 
   * @return radius | The Circle radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the new Circle radius
   * 
   * @param radius | The new Circle radius
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Implements the getArea method defined in GeometricObject
   * 
   * @return radius*radius*Math.PI | The Circle area
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * Implements the getPerimeter method defined in GeometricObject
   * 
   * @return 2*radius*Math.PI | The Circle perimeter
   */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /**
   * Overrides the equals() method defined in the Object class
   * 
   * @param circle | The circle to compare with
   * @return this.radius == circle.getRadius() | 
   * True if the radius of this circle is equal to the radius of the given circle, false otherwise
   */
  public boolean equals(Circle circle) {
    return this.radius == circle.getRadius();
  }

  /**
   * Provides a string representation of the circle
   * 
   * @return "[Circle] radius = " + radius | A string representation of the circle
   */
  @Override 
  public String toString() {
    return "[Circle] radius = " + radius;
  }
}
