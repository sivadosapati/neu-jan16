package lecture6;

public class InterfaceTest {
	public static void main(String args[]) {
		Professor siva = new JavaProfessor();
		Professor yahav = new AlgorithmsProfessor();
		siva.teach();
		System.out.println(siva.answerQuestion("What is Interface"));
		yahav.teach();
		System.out.println(yahav.answerQuestion("What is Cloud Computing"));
		MarriedFatherJavaProfessor mfjp = new MarriedFatherJavaProfessor();
		Professor john = mfjp;
		john.teach();
		Dad dad = mfjp;
		dad.tellStories();
	
	}
}

interface Professor {
	void teach();

	String answerQuestion(String question);
}

interface Dad {
	void tellStories();
}

interface Husband {
	void eatDinner();
}

class JavaProfessor implements Professor {

	@Override
	public void teach() {
		System.out.println("Java Professor is teaching Java..");

	}

	@Override
	public String answerQuestion(String question) {
		return "Answer for Question -> " + question;
	}

}

class MarriedFatherJavaProfessor implements Professor, Husband, Dad {

	@Override
	public void tellStories() {
		System.out.println("Dad is telling stories to daughter..");

	}

	@Override
	public void eatDinner() {
		System.out.println("Eat dinner in the night");
	}

	@Override
	public void teach() {
		System.out.println("Teaching Java");

	}

	@Override
	public String answerQuestion(String question) {
		System.out.println("Answer Question");
		return "Answer -> " + question;
	}

}

class AlgorithmsProfessor implements Professor {

	@Override
	public void teach() {
		System.out.println("Algorithm Professor writes a lot of algorithms");
		System.out.println("Algorithm Professor does show slides..");
	}

	@Override
	public String answerQuestion(String question) {
		System.out
				.println("Algorithm Professor likes to answer questions by writing code");
		return "Code an algorith for a Question -> " + question;
	}

}