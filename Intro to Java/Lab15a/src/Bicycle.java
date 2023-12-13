import java.util.ArrayList;

/**
 * Abstract Vehicles
 *
 * @author Aliyah Lewis
 *
 */

public class Bicycle extends Vehicle {
	
    public Bicycle() {
        super("Bicycle");
    }

    /**
     * Gets the details of the tires for the bicycle
     * 
     * @return tires | Tire objects representing the two skinny tires of the bicycle
     */
    @Override
    public ArrayList<Tire> getTires() {
        ArrayList<Tire> tires = new ArrayList<>();
        tires.add(new Tire("skinny"));
        tires.add(new Tire("skinny"));
        return tires;
    }
}