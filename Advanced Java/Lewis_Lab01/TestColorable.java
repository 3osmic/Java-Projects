/**
 * Tester
 */

public class TestColorable {
	/**
     * Starts the program running and prints the area of a shape and it's area after it's colored
     * @param args command line arguments
     */
	public static void main (String[] args) {
		GeometricObject[] objects = { new Square(2), new Circle(5), new Square(5), 
				new Rectangle(3, 4),  new Square(4.5) };
				for (int i = 0; i < objects.length; i++) {
					System.out.println("Area is " + objects[i].getArea());
					if (objects[i] instanceof Colorable)
						((Colorable) objects[i]).howToColor();
			}
	}
}


