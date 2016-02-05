package lecture3;

public class EnumTest {
	public static void main(String args[]) {
		
		Show show = new Show();
		Person siva = new Person();
		siva.gender = Gender.MALE;
		siva.bag = new Bag();
		siva.bag.color = Color.RED;
		
		Person dora = new Person();
		dora.gender = Gender.FEMALE;
		dora.bag = new Bag();
		dora.bag.color = Color.BLUE;
		
		Person jia = new Person();
		jia.gender = Gender.FEMALE;
		jia.bag = new Bag();
		jia.bag.color = Color.RED;
		
		System.out.println("Siva -> "+show.isAdmittable(siva));
		System.out.println("Dora -> "+show.isAdmittable(dora));
		System.out.println("Jia -> "+show.isAdmittable(jia));
		
		
	}
}

class Show{
	boolean isAdmittable(Person person){
		Gender g = person.gender;
		if( g == Gender.FEMALE){
			Bag b = person.bag;
			Color c = b.color;
			if( c == Color.RED){
				return true;
			}
		}
		return false;
	}
}

class Person{
	Gender gender;
	Bag bag;
}

enum Gender{
	MALE, FEMALE;
}

class Bag{
	Color color;
}

enum Color{
	RED, BLUE, YELLOW, ORANGE;
}