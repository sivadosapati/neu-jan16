package lecture8;

public class StudentThread {

	public static void main(String args[]) throws Exception{
		Student dora = new Student("dora");
		Student kerwin = new Student("kerwin");
		// dora.typeInComputer();
		// kerwin.typeInComputer();
		// dora.answerQuestion();
		// kerwin.answerQuestion();
		Thread doraTypeInComputerThread = new TypeInComputerThread(dora);
		Thread doraAnswerQuestionThread = new AnswerQuestionThread(dora);
		Thread kerwinTypeInComputerThread = new TypeInComputerThread(kerwin);
		Thread kerwinAnswerQuestionThread = new AnswerQuestionThread(kerwin);
		
		doraTypeInComputerThread.start();
		doraAnswerQuestionThread.start();
		kerwinTypeInComputerThread.start();
		kerwinAnswerQuestionThread.start();
		
		System.out.println("DONE");
		Thread.sleep(5000);
		System.out.println("Done waiting");
		
		doraTypeInComputerThread.start();

	}

	static class TypeInComputerThread extends Thread {
		Student s;

		public TypeInComputerThread(Student s) {
			this.s = s;
		}

		public void run() {
			s.typeInComputer();
		}
	}

	static class AnswerQuestionThread extends Thread {
		Student s;

		public AnswerQuestionThread(Student s) {
			this.s = s;

		}

		public void run() {
			s.answerQuestion();
		}
	}

	static class Student {
		String name;

		Student(String name) {
			this.name = name;
		}

		public void answerQuestion() {
			System.out.println(name + " is answering Question # 1");
			pause();
			System.out.println(name + " is answering Question # 2");
			pause();
			System.out.println(name + " is answering Question # 3");

		}

		public void typeInComputer() {
			System.out.println(name + " is typing in computer # 1");
			pause();
			System.out.println(name + " is typing in computer # 2");
			pause();
			System.out.println(name + " is typing in computer # 3");
			pause();

		}

		public void pause() {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
