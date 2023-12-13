/**
 * GeometricObject
 *
 * @author Aliyah Lewis
 *
 */

public abstract class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with color and filled value
	 * 
	 * @param color | The geometric object color
	 * @param filled | Whether the geometric object is filled or not
	 */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** 
	 * Return the geometric object color
	 * 
	 * @return color | The geometric object color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Return the new geometric object color
	 * 
	 * @param color | The new geometric object color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return whether the geometric object is filled or not
	 * 
	 * @return filled | True if the geometric object is filled, false otherwise
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * Set a new filled value for the geometric object
	 * 
	 * @param filled | The new filled value for the geometric object
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * Get the date when the geometric object was created
	 * 
	 * @return dateCreated | The date when the geometric object was created
	 */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Provide a string representation of the geometric object
	 * 
	 * @return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled | 
	 * A string representation of the geometric object
	 */
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/**
	 * Abstract method to get the area of the geometric object
	 * 
	 * @return getArea() | The geometric object area
	 */ 
	public abstract double getArea();

	/**
	 * Abstract method to get the perimeter of the geometric object
	 * 
	 * @return getPerimeter() | The geometric object perimeter
	 */
	public abstract double getPerimeter();
}