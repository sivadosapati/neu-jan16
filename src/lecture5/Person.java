package lecture5;

public class Person {
	public void eat(Biscuit b) {
		System.out.println("Eating Biscuit");
	}

	public void eat(Choclate c) {
		System.out.println("Eating Choclate");
	}

	public void eat(Icecream ic) {
	}

	public void eat(Fruit f) {
		System.out.println("Eating fruit -> " + f.getClass().getSimpleName());
	}

	public static void main(String args[]) {
		Person p = new Person();
		Biscuit b = new Biscuit();
		Choclate c = new Choclate();
		Mango m = new Mango();
		Apple a = new Apple();
		p.eat(b);
		p.eat(c);
		p.eat(m);
		p.eat(a);
		p.eat(new Banana());
	}
}

class Biscuit {
}

class Choclate {
}
