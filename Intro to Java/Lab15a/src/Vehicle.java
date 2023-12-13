import java.util.ArrayList;

/**
 * Abstract Vehicles
 *
 * @author Aliyah Lewis
 *
 */

public abstract class Vehicle {
	
    private String vehicleType;

    /**
     * Constructs a vehicle with the type
     * 
     * @param vehicleType | The vehicle type
     */
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Gets the vehicle type
     * 
     * @return vehicleType | The vehicle type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Gets the details of the tires for the vehicle
     * 
     * @return ArrayList<Tire> | Tire objects representing the tires of the vehicle
     */
    public abstract ArrayList<Tire> getTires();
}