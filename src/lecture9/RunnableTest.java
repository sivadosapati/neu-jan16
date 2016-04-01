package lecture9;

public class RunnableTest {
	public static void main(String args[]) {
		Student s = new Student();
		@SuppressWarnings("unused")
		class ListenToLectureJob implements Runnable {

			@Override
			public void run() {
				s.listenToLecture();
			}

		}
		
		class WriteNotesJob implements Runnable{

			@Override
			public void run() {
				s.writeNotes();
			}
			
		}
		
		class RepeatThread extends Thread{
			public void run(){
				for(int i =0;i<1000;i++){
					s.speak();
					s.pause(5000);
				}
			}
		}
		RepeatThread rt = new RepeatThread();
		rt.start();
		Thread a = new Thread(new ListenToLectureJob());
		Thread b = new Thread(new WriteNotesJob());
		a.start();
		b.start();
		//s.listenToLecture();
		//s.writeNotes();
	}
}

class Person {
	void speak() {
		System.out.println("I'm speaking");
	}
}

class Student extends Person {
	void pause(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {

		}
	}

	void writeNotes() {
		for (int i = 0; i < 10; i++) {
			pause(10);
			System.out.println("I'm writing notes");
		}

	}

	void listenToLecture() {
		for (int i = 0; i < 10; i++) {
			pause(10);
			System.out.println("I'm listening to Lecture");
		}
	}
}
