package lecture8;

public class SynchronizerTest {
	public static void main(String args[]) {
		final Human h = new Human();
		Thread think = createThinkThread(h);
		Thread talk = createTalkThread(h);
		Thread eat = createEatThread(h);
		Thread sleep = createSleepThread(h);
		Thread watch = createWatchThread(h);
		think.start();
		talk.start();
		eat.start();
		sleep.start();
		watch.start();
		System.out.println("Done..");
	}

	static Thread createThinkThread(Human h) {
		return new Thread(() -> h.think());
	}

	static Thread createTalkThread(Human h) {
		return new Thread(() -> h.talk());
	}

	static Thread createSleepThread(Human h) {
		return new Thread(() -> h.sleep());
	}

	static Thread createEatThread(Human h) {
		return new Thread(() -> h.eat());
	}

	static Thread createWatchThread(Human h) {
		return new Thread(() -> h.watchMovie());

	}

	static class Human {

		Object SLEEP_WATH_MOVIE_LOCK = new Object();

		void think() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thinking -> " + i);
				pause(25);
			}
		}

		synchronized void sleep() {
			synchronized (SLEEP_WATH_MOVIE_LOCK) {
				for (int i = 0; i < 10; i++) {
					System.out.println("Sleeping -> " + i);
					pause(25);
				}
			}
		}

		synchronized void eat() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Eating -> " + i);
				pause(25);
			}
		}

		void watchMovie() {
			synchronized (SLEEP_WATH_MOVIE_LOCK) {
				for (int i = 0; i < 10; i++) {
					System.out.println("Watch Movie -> " + i);
					pause(25);
				}
			}
		}

		synchronized void talk() {
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
