/**
 * Rectangle
 *
 * @author Aliyah Lewis
 *
 */

public class Rectangle extends GeometricObject {
	
  private double width;
  private double height;

  public Rectangle() {
  }

  /**
   * Constructs a rectangle with the width and height
   * 
   * @param width | The rectangle width
   * @param height | The rectangle height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Gets the width of the rectangle
   * 
   * @return width | The rectangle width
   */
  public double getWidth() {
    return width;
  }

  /**
   * Sets the width of the rectangle
   * 
   * @param width | The new rectangle width
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Gets the height of the rectangle
   * 
   * @return height | The rectangle height
   */
  public double getHeight() {
    return height;
  }

  /**
   * Sets the height of the rectangle
   * 
   * @param height | The new rectangle height
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * Gets the rectangle area
   * 
   * @return width * height | The rectangle area
   */
  public double getArea() {
    return width * height;
  }

  /**
   * Gets the rectangle perimeter
   * 
   * @return 2 * (width + height) | The rectangle perimeter
   */
  public double getPerimeter() {
    return 2 * (width + height);
  }
}
