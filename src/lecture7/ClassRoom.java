package lecture7;

public class ClassRoom {

	public static void main(String args[]) {
		ClassRoom cr = new ClassRoom();
		NEUStudent ks = new NEUStudent("KS");
		cr.addStudent(new NEUStudent("Kerwin"));
		cr.addStudent(ks);
		cr.addStudent(new NEUStudent("Jia"));
		cr.addStudent(new NEUStudent("LJ"));
		cr.addStudent(new NEUStudent("Dora"));
		System.out.println(cr.getCountOfStudents());
		cr.allStudentsWrite();
		cr.studentLeavingClass(ks);
		cr.allStudentsWrite();

	}

	private NEUStudent student[] = new NEUStudent[5];
	int numberOfStudents = 0;

	public void addStudent(NEUStudent st) {
		student[numberOfStudents] = st;

		numberOfStudents++;
	}

	public int getCountOfStudents() {
		return numberOfStudents;
	}

	public void allStudentsWrite() {
		for (NEUStudent neuStudent : student) {
			if (neuStudent != null)
				neuStudent.writeInBook();
		}
	}

	public void studentLeavingClass(NEUStudent st) {
		for (int i = 0; i < 5; i++) {
			if (student[i] == st) {
				student[i] = null;
				numberOfStudents--;
			}
		}
	}
}

class NEUStudent {
	String name;

	NEUStudent(String name) {
		this.name = name;
	}
	
	public int hashCode(){
		return name.hashCode();
	}

	public void writeInBook() {
		System.out.println(name + " is writing");
	}

	public String toString() {
		return "Name[" + name + "]";
	}

	public boolean equals(Object object) {
		NEUStudent ns = (NEUStudent) object;
		return ns.name.equals(name);
	}
}
