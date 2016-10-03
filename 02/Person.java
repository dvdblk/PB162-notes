public class Person {

	private String name;
	private int yearOfBirth;
	private Address address;
	private static final int CURRENT_YEAR = 2016; // final => can't be set anymore => const

	public Person(String name, int yob, Address addr) {
		this.name = name;
		this.yearOfBirth = yob;
		address = addr;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return this.address;
	}
	
	public void setName(String name) {
		//name = newName;
		if (name != '') {
		    this.name = name;
		} else {
		}
		this.name = name;
	}
	
	/**
	* Vrati aktualni jmeno.
	*
	* @return aktualni jmeno
	*/
	public String getName() {
		return name;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth
	}

	public void setYearOfBirth(int yob) {
		yearOfBirth = yob
	}
	
	public int getAge() {
		//return Person.currentYear - yearOfBirth; //can be used too...
		return Person.CURRENT_YEAR - yearOfBirth;
	}
}
