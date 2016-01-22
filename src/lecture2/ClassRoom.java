package lecture2;

public class ClassRoom {

	public static void main(String[] args) {
		// printTraditionalWay();
		printUsingLoops();

	}

	private static void printUsingLoops() {
		Student students[];
		students = new Student[5];
		students[0] = new Student();
		students[0].name = "KS";
		students[1] = new Student();
		students[1].name = "KW";
		students[2] = new Student();
		students[2].name = "DF";
		students[3] = new Student();
		students[3].name = "JH";
		students[4] = new Student();
		students[4].name = "LJ";

		for (int i = 0; i < 5; i++) {
			students[i].listen();
		}
		System.out.println("____________");

		for (Student student : students) {
			student.listen();
		}

	}

	public static void printTraditionalWay() {
		Student a = new Student();
		a.name = "KS";
		Student b = new Student();
		b.name = "KW";
		Student c = new Student();
		c.name = "DF";
		Student d = new Student();
		d.name = "JH";
		Student e = new Student();
		e.name = "LJ";

		a.listen();
		b.listen();
		c.listen();
		d.listen();
		e.listen();
	}

}
