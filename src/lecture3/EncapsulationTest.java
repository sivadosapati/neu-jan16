package lecture3;

import java.util.LinkedHashSet;
import java.util.Set;

public class EncapsulationTest {

	public static void main(String[] args) {
		Student k = new Student();
		k.name = "KS";
		Student ke = new Student();
		ke.name = "Kerwin";
		Student d = new Student();
		d.name = "Dora";
		// NonEncapsulatedProfessor nep = new NonEncapsulatedProfessor();
		EncapsulatedProfessor nep = new EncapsulatedProfessor();
		k.takeMoney(nep);
		ke.takeMoney(nep);
		k.takeMoney(nep);
		d.takeMoney(nep);
	}

}

class PersonalAssistantForProfessor {
	public void memorizeTheStudentName(Student student) {
		// students.add(student);
		students[numberOfStudentsTakenMoney] = student;
		numberOfStudentsTakenMoney++;
	}

	public boolean isStudentAlreadyPaidBefore(Student student) {
		/*
		 * if (students.contains(student)) { return true; } return false;
		 */
		for (int i = 0; i < numberOfStudentsTakenMoney; i++) {
			if (student == students[i]) {
				return true;
			}
		}
		return false;
	}

	private Student[] students = new Student[50];
	private int numberOfStudentsTakenMoney = 0;

	// private Set<Student> students = new LinkedHashSet<Student>();

}

class EncapsulatedProfessor {
	private int money = 20;
	
	private PersonalAssistantForProfessor pp = new PersonalAssistantForProfessor();

	public int getMoney() {
		return money;
	}

	public int giveMoney(Student student, int amount) {
		if (pp.isStudentAlreadyPaidBefore(student)) {
			System.out.println(student.name
					+ " is already paid before and will not be paid now");
			return 0;
		}
		if (amount <= money) {
			money = money - amount;
			pp.memorizeTheStudentName(student);
			return amount;
		} else {
			System.out.println("You asked me " + amount
					+ " dollars but I have only " + money
					+ " dolloars. I'm sorry!");
			return 0;
		}
	}

}

class NonEncapsulatedProfessor {
	public int money = 20;
}

class Student {
	String name;

	int takeMoney(NonEncapsulatedProfessor nep) {
		int x = (int) (Math.random() * 10);
		nep.money = nep.money - x;
		System.out.println(name + " is taking " + x
				+ " dollars. Professor has " + nep.money + " dollars");
		return x;
	}

	int takeMoney(EncapsulatedProfessor ep) {
		int x = (int) (Math.random() * 10);
		int y = ep.giveMoney(this, x);
		System.out.println(name + " has requested " + x
				+ " dollars. Professor has given " + y
				+ " dollars. Professor now has " + ep.getMoney() + " dollars");
		return x;

	}
}
