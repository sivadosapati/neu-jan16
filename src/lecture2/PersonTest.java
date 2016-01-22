package lecture2;

public class PersonTest {

	public static void main(String[] args) {
		Person person;
		person = new Person();
		person.name = "Dora";
		person.age = 18;
		person.height = 5.6f;
		person.gender = true;
		
		Address neuAddress = new Address();
		neuAddress.street1 = "401 Terry ave";
		neuAddress.stree2 = "Suite # 401";
		neuAddress.city = "Seattle";
		neuAddress.state = "WA";
		
		person.address = neuAddress;
		
		Person person2 = new Person();
		person2.name = "Khutaija";
		person2.age = 18;
		person2.height = 5.5f;
		
		if( person.age == person2.age){
			System.out.println("Both persons are of same age");
			
		}
		else{
			System.out.println("Both persons are of different ages");
			
		}
	}

}
