package lecture2;

public class Student {
	float gpa;
	boolean gender;
	String name;
	void listen(){
		System.out.println(name +" is listening");
	}

	boolean canParticipateInGirlsCampaign() {
		if (gender == true) {
			System.out.println("Can participate");
			return true;
		} else {
			System.out.println("Can't participate");
			return false;
		}
	}

	String findGrade() {
		if (gpa > 3.75f) {
			return "A+";
		}
		if (gpa > 3.5f && gpa <= 3.75f) {
			return "A-";
		}
		if (gpa > 3.25f && gpa <= 3.5f) {
			return "B+";
		}
		return "B-";
	}

	public static void main(String args[]) {
		Student a = new Student();
		a.gpa = 3.69f;
		a.gender = true;
		Student b = new Student();
		b.gpa = 2.45f;
		b.gender = false;
		System.out.println(a.findGrade());
		System.out.println(b.findGrade());
		a.canParticipateInGirlsCampaign();
		boolean bb = b.canParticipateInGirlsCampaign();
		System.out.println(bb);
	}
}
