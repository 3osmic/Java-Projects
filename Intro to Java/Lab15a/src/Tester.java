/**
 * Abstract Vehicles
 *
 * @author Aliyah Lewis
 *
 */

public class Tester {
	/**
     * Starts the program running and prints the type of vehicle with its tires
     * @param args command line arguments
     */
	public static void main(String[] args) {
		Vehicle bicycle = new Bicycle();
		System.out.println(bicycle.getVehicleType());
		for(Tire t : bicycle.getTires()) {
			System.out.println(t.getSize());
		}

		Vehicle dragster = new Dragster();
		System.out.println(dragster.getVehicleType());
		for(Tire t : dragster.getTires()) {
			System.out.println(t.getSize());
		}
	
	}

}
