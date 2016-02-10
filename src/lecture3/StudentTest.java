package lecture3;

public class StudentTest {
	public static void main(String args[]) {
		StudentWithoutEncapsulation dora = new StudentWithoutEncapsulation(
				"100", "Dora");
		System.out.println(dora.name);
		dora.name = "Siva";
		System.out.println(dora.name);
		dora.name = "Garbage";
		System.out.println(dora.name);
		
		StudentWithEncapsulation encapsulatedDora = new StudentWithEncapsulation("100", "Dora");
		System.out.println(encapsulatedDora.getName());
		
	}
}

class StudentWithoutEncapsulation {
	public String name;
	public String id;

	public StudentWithoutEncapsulation(String i, String n) {
		name = n;
		id = i;
	}

}

class StudentWithEncapsulation {
	private String name;
	private String id;

	public StudentWithEncapsulation(String i, String n) {
		name = n;
		id = i;
	}

	public String getName() {
		return name;
	}
}
