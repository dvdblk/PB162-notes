/**
 * @author dvdblk
 */

public class Car implements Informing {

	private String rz;
	private String type;


	/**
	 * @param rz Registration nr
	 * @param type Car type
	 */
	public Car(String rz, String type) {
		this.rz = rz;
		this.type = type;
	}

	public void writeInfo() {
		System.out.println("Car of type "+type+"with RZ "+rz);
	}
}