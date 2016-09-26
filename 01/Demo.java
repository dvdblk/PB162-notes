public class Demo {
	
	public static void main(String[] args) {
	Person karel = new Person();
        Person pepa = new Person();
        
        karel.setName("Karel");
        pepa.setName("Pepa");
        
        String karelName = karel.getName();
	if (karel.getName().equals("Karel")) {
		System.out.println("Je to Karel!");
	}

	for (i = 0;i < 2;i++) {
		karel.writeInfo();
	}
}
