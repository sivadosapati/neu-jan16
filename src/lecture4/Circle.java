package lecture4;

public class Circle {
	
	public static void main(String args[])throws Exception{
		Circle c1;
		Circle c2 = new Circle(5);
		c1 = c2;
		System.out.println(c1.getRadius());
		c2.setRadius(15);
		System.out.println(c1.getRadius());
		c2 = null;
		c1 = null;
		System.gc();
		Thread.sleep(10);
		Circle c3 = new Circle(76);
		System.out.println(c3.getRadius());
		c3 = null;
		System.gc();
	}
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void finalize() {
		System.out.println("Circle with radius -> " + getRadius()
				+ " is destroyed!");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
