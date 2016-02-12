package lecture5;

public class FruitTest {
	public static void main(String args[]) {
		Fruit f = new Fruit();
		System.out.println(f.getInfo());
		f.setPrice(10);
		f.setNumberOfDaysInTheShop(2);
		System.out.println(f.getInfo()+"\n---------------Mango--");

		Mango m = new Mango();
		System.out.println(m.getInfo());
		System.out.println(m.isJuicy());

		m.setPrice(25);
		System.out.println(m.isExpensive());
		m.setPrice(5);
		System.out.println(m.isExpensive());

		f = new Fruit();
		f.setPrice(5);
		System.out.println(f.isExpensive());
		System.out.println("-------");
		m.setPrice(10);
		m.setNumberOfDaysInTheShop(5);
		System.out.println(m.isExpensive());
		m.setNumberOfDaysInTheShop(2);
		System.out.println(m.isExpensive());
		
		Fruit f1 = new Fruit();
		Mango m1 = new Mango();
		Fruit f2 = f1;
		f2 = m1;
		Apple a1 = new Apple();
		f2 = new Mango();
		f2 = new Banana();
		m1 = (Mango)f2;
		
	
		
		
		
		
	}
}
