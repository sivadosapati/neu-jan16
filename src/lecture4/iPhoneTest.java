package lecture4;

public class iPhoneTest {
	public static void main(String args[]) {
		iPhone kerwinPhone = new iPhone();
		System.out.println(kerwinPhone.getInfo());
		iPhone doraPhone = new iPhone(128);
		System.out.println(doraPhone.getInfo());
		iPhone jiaPhone = new iPhone(128, Color.PINK);
		System.out.println(jiaPhone.getInfo());
		iPhone ljPhone = new iPhone(32, Color.WHITE, "4s");
		System.out.println(ljPhone.getInfo());
		
		Cover cover = new Cover(4);
		doraPhone.setCover(cover);
		System.out.println(doraPhone.getInfo());
	}

}
