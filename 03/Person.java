public class Person implements Informing, Going {

	private String name;
	private String address;
	private static int peopleCount = 0;
	public static final int MAX_PEOPLE_COUNT = 100;
	private boolean isGoing = false;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
		peopleCount++;
	}


	public Address getAddress() {
		return this.address;
	}

	public String getName() {
		return name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		//name = newName;
		if (name != '') {
		    this.name = name;
		} else {
			this.name = "";
		}
	}

	public void writeInfo() {
		//System.out.println("Person " + name);
		System.out.println("Person " + name + ((isGoing) ? " is going." : "is not going."));
	}

	public static int getPeopleCount() {
		// pracuje so statickym atributom, moze ho teda pouzit
		// inak nemoze pouzivat nestaticke metody.
		return peopleCount;
	}

	public static boolean maxPeopleCountReached() {
		return peopleCount >= MAX_PEOPLE_COUNT;
	}

	public void start() {
		isGoing = true;
	}

	public void stop() {
		isGoing = false;
	}
}
