public class Demo {
	
	public static void main(String[] args) {
		/*Person person, person2; // value in memory = null
		person = new Person() // not null anymore
		person2 = person // same object as person, just adding a reference, much like Swift

		String msg = "Hey!" // java.lang.String (and many many more...) are imported by default

		double d = 2
		double dd = d // possible
		// char int byte short long...
		// float 32 / double 64bit
		float testF = 0.5f;
		// int, bool, double, etc... = primitive data type => "Swift struct", copied by value
		int i = 1;
		int j;

		j = i;
		j = j + 2; // j = 3

		addTwo(i);
		System.out.println("i: " + i); // i = 1
		*/

		Address addr = new Address("Brno", "Botanicka");
		//addr.setStreet("Botanicka");
		//addr.setTown("Brno");

		Person p1 = new Person("Karel", 1990, addr);
		Person p2 = new Person("Pepa", 2000, addr);

	}

	public static void addTwo(int i) {
		i += 2;
	}


}