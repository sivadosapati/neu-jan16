public class ThreadTest {	
	public static void main(String args[]){
		Human h = new Human();
		h.think();
		h.talk();
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
