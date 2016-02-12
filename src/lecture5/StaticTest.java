package lecture5;

public class StaticTest {
	public static void main(String args[]) {
		JavaStudentForInfo5100InSpring ks = new JavaStudentForInfo5100InSpring(
				"KS");
		JavaStudentForInfo5100InSpring kw = new JavaStudentForInfo5100InSpring(
				"KW");
		JavaStudentForInfo5100InSpring dora = new JavaStudentForInfo5100InSpring(
				"Dora");
		ProfessorForInfo5100InSpring siva = new ProfessorForInfo5100InSpring(
				"siva");
		ks.ask();
		kw.ask();
		dora.ask();
		ks.listen();
		kw.listen();
		
		JavaStudentForInfo5100InSpring.ask();
		
		ProfessorForInfo5100InSpring someOtherProf = new ProfessorForInfo5100InSpring("Some Other Professor");
		someOtherProf.energy = 500;
		ks.professor = someOtherProf;
		ks.ask();
		dora.ask();
	}
}

class JavaStudentForInfo5100InSpring {
	String name;
	
	static int sum(int a, int b){
		return a + b;
	}

	public JavaStudentForInfo5100InSpring(String name) {
		this.name = name;
	}

	public static void ask() {
		professor.teach();
	}

	public void listen() {
		System.out.println(name +" is listening");
	}

	static ProfessorForInfo5100InSpring professor = new ProfessorForInfo5100InSpring(
			"siva");
}

class ProfessorForInfo5100InSpring {
	String name;

	public ProfessorForInfo5100InSpring(String name) {
		this.name = name;
	}

	int energy = 100;

	void teach() {
		if (energy == 0) {
			System.out.println("I'm done Teaching. Thank you very much");
			return;
		}
		energy--;
		System.out.println(name+" is teaching -> Energy -> " + energy);

	}
}