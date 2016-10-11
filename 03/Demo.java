public class Demo {
	
	public static void main(String[] args) {
		/*Person p1 = new Person("Jan Novak", "Botanicka 68a, Brno");
		Person p2 = new Person("Tomas D.", "Gorkeho 7");

		//System.out.println(p1.getPeopleCount()); same but below is preffered
		System.out.println(Person.getPeopleCount());
		*/
		Person karel = new Person("Karel");
		Car skoda = new Car("1A1 11-11", "Skoda");
		
		System.out.println(karel.getName());

		//Car c = karel; doesn't work ofc
		Informing personInfo = karel;
		Informing carInfo = car;

		Person p2 = (Person) info;
		p2.getName();

		writeInfoNTimes(skoda, 10);
	}

	public static void writeInfoNTimes(Informing obj, int n) {
		for (int i = 0; i < n; i++) {
			obj.writeInfo();
			if (obj instanceof Person) {
				Person p = (Person) obj;
				System.out.println(p.getName());
			}
		}
	}
}