package lecture3;

public class WrapperTest {
	int i;
	Integer ii;
	boolean passOrFail;

	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		System.out.println(wt.i);
		System.out.println(wt.ii);
		System.out.println(wt.passOrFail);
		
		wt.autoBoxTest();

	}
	
	void autoBoxTest(){
		int i = 65;
		Float ii = 76f;
		Float result = i + ii;
		System.out.println(result);
		
		boolean passOrFail = false;
		Boolean OBJECT = passOrFail;
		System.out.println(OBJECT);
		
		Integer x = 0;
		int y = x + 10;
		System.out.println(y);
	}

}
