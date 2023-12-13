import java.util.ArrayList;

/**
 * Abstract Vehicles
 *
 * @author Aliyah Lewis
 *
 */

public class Dragster extends Vehicle {
	
    public Dragster() {
        super("Dragster");
    }

    /**
     * Gets the details of the tires for the dragster
     * 
     * @return tires | Tire objects representing the two slick and two medium tires of the dragster
     */
    @Override
    public ArrayList<Tire> getTires() {
        ArrayList<Tire> tires = new ArrayList<>();
        tires.add(new Tire("slick"));
        tires.add(new Tire("slick"));
        tires.add(new Tire("medium"));
        tires.add(new Tire("medium"));
        return tires;
    }
}