public class Person {

	private String name = "no-name";
	private int age = 100;
	
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
	
	public boolean setAge(int newAge) {
		if (newAge > 0) {
		    age = newAge;
		    return true;
		} else {
		    return false;
		}
	}

	public int getAge() {
		return age;
	}
	
	public void writeInfo() {
	    System.out.println("Name: " + name + ", age: " + age);
    	}
	
	public void writeInfo(boolean toUpperCase) {
		if (toUpperCase) {
			String output = "Name: " + name + ", age: " + age;
			System.out.println(uOutput.toUpperCase());
		} else {
			writeInfo();
		}
	}
}
