package lecture9;

public class WaitNotifyTest {

	public static void main(String args[]) {
		Professor p = new Professor();
		Graduate g = new Graduate();
		g.professor = p;
		p.graduate = g;
		Thread pt = new Thread() {
			public void run() {
				try {
					p.askQuestion();
				} catch (Exception e) {
				}
			}
		};
		Thread gt = new Thread() {
			public void run() {
				try {
					g.answerQuestion();
				} catch (Exception e) {
				}
			}
		};
		pt.start();
		gt.start();

	}

}

class Professor {
	boolean canAskQuestion = true;
	String question;
	Graduate graduate;

	public void askQuestion() throws Exception {
		while (true) {
			if (canAskQuestion) {
				question = "Question is -> " + Math.random();
				System.out.println(question);
				canAskQuestion = false;
				synchronized (graduate) {
					graduate.notify();
				}
			} else {

				synchronized (this) {
					this.wait();
					this.setCanAskQuestion(true);
				}
			}
		}
	}

	public String getQuestion() {
		return question;
	}

	public boolean isCanAskQuestion() {
		return canAskQuestion;
	}

	public void setCanAskQuestion(boolean b) {
		this.canAskQuestion = b;
	}
}

class Graduate {
	boolean canAnswer = false;
	Professor professor;

	public void answerQuestion() throws Exception {
		while (true) {
			if (canAnswer) {
				String question = professor.getQuestion();
				System.out.println("Answer is -> " + Math.random()
						+ " for -> question -> " + question);
				synchronized (professor) {
					professor.notify();
				}
				canAnswer = false;
			} else {

				synchronized (this) {
					wait();
					canAnswer = true;
				}
			}
		}
	}
}