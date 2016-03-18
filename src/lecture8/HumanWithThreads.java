package lecture8;

public class HumanWithThreads {
	public static void main(String args[]) throws Exception {
		final Human h = new Human();
		Thread think = createThinkThread(h);
		Thread talk = createTalkThread(h);
		think.start();
		talk.start();
		System.out.println("Done..");
	}

	static Thread createThinkThread(Human h) {
		return new Thread() {
			public void run() {
				h.think();
			}
		};
	}

	static Thread createTalkThread(Human h) {
		return new Thread() {
			public void run() {
				h.talk();
			}
		};
	}

	static class Human {
		void think() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thinking -> " + i);
				pause(10);
			}
		}

		void talk() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Talking -> " + i);
				pause(25);
			}
		}

		private void pause(int x) {
			try {
				Thread.sleep(x);
			} catch (Exception e) {
			}
		}
	}
}
