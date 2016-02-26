package lecture7;

import java.util.ArrayList;
import java.util.Collection;

public class ClassRoomWithCollection {

	public static void main(String args[]) {
		ClassRoomWithCollection cr = new ClassRoomWithCollection();
		NEUStudent ks = new NEUStudent("KS");
		cr.addStudent(new NEUStudent("Kerwin"));
		cr.addStudent(new NEUStudent("Siva"));
		cr.addStudent(ks);
		cr.addStudent(new NEUStudent("Jia"));
		cr.addStudent(new NEUStudent("LJ"));
		cr.addStudent(new NEUStudent("Dora"));
		System.out.println(cr.getCountOfStudents());
		cr.allStudentsWrite();
		cr.studentLeavingClass(ks);
		cr.allStudentsWrite();

		ArrayList<NEUStudent> st = cr.getAllStudents();

	}

	private ArrayList<NEUStudent> students = makeStudentsCollection();

	private ArrayList<NEUStudent> makeStudentsCollection() {
		return new ArrayList<NEUStudent>();
		// return new Vector<NEUStudent>();
		// return new HashSet<NEUStudent>();
	}

	public void addStudent(NEUStudent st) {
		students.add(st);
	}

	public ArrayList<NEUStudent> getAllStudents() {
		return students;
	}

	public int getCountOfStudents() {
		return students.size();
	}

	public void allStudentsWrite() {
		for (NEUStudent neuStudent : students) {
			neuStudent.writeInBook();
		}
	}

	public void studentLeavingClass(NEUStudent st) {
		students.remove(st);
	}
}
