/**
 * Abstract Vehicles
 *
 * @author Aliyah Lewis
 *
 */

public class Tire {

	private String size;

	/**
	 * Constructs a tire with the size
	 * 
	 * @param siz | The tire size
	 */
	public Tire(String siz) {
		this.size = siz;
	}

	/**
	 * Gets the size of the tire
	 * 
	 * @return size | The tire size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * 
	 * 
	 * @param obj | The object to compare
	 * @return true | If the tires are equal, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tire other = (Tire) obj;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}


}
