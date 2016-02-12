package lecture5;

public class Shapes {
	public static void main(String args[]) {
		Shape s = new Shape();
		Circle c = new Circle();
		System.out.println(s.toString());
		System.out.println(c.toString());
		
		Shape x = c;
		System.out.println(x.toString());
		
		Rectangle r = new Rectangle();
		Square square = new Square();

		//c = (Circle) s;// Will throw error at runtime
		s = r;
		s = square;
		// r = c
		r = square;
		square = (Square) r;

	}
}

class Shape {
	public String toString() {
		return "I'm shape";
	}
}

class Circle extends Shape {
	@Override
	public String toString() {
		return "I'm Circle";
	}
	
	protected int radius;
	protected final float pi = 22.0f/7.0f;
	public final float getArea(){
		//return pi * radius * radius;
		AreaFinder af = new AreaFinder();
		//return af.findArea(this);
		return AreaFinder.findArea(this);
	}
}

class AreaFinder{
	public static float findArea(Circle circle){
		return circle.pi * circle.radius * circle.radius;
	}
}

final class RedCircle extends Circle{
	
	/*public float getArea(){
		return pi * radius * radius * radius;
	}*/
	public void tamperData(){
		//pi = 21.0f/6.2f;
	}
}


class Rectangle extends Shape {

}

class Square extends Rectangle {

}
