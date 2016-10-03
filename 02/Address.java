public class Address {
	private String town;
	private String street;

	// constructor
	public Address(String town, String street) {
		this.town = town
		this.street = street
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getTown() {
		return this.town;
	}

	public void setStreet(String street) {
		this.street = street
	}

	public String getStreet() {
		return this.street;
	}

}