package lecture6;

public class AbstractTest {
	public static void main(String args[]) {
		Circle c = new Circle();
		c.radius = 10;
		System.out.println("Area of -> " + c.toString() + " =" + c.getArea());
		Square s = new Square();
		s.side = 5;
		System.out.println("Area of -> " + s.toString() + " =" + s.getArea());
		

	}
}

abstract class Shape {
	abstract float getArea();
	public String toString() {
		return getClass().getSimpleName();
	}
}

class Circle extends Shape {
	public int radius;

	public float getArea() {
		return (float) (Math.PI * radius * radius);
	}
}

abstract class Polygon extends Shape{
	
}
class Square extends Polygon {
	public int side;

	@Override
	float getArea() {
		return side * side;
	}
}
