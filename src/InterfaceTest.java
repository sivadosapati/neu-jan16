interface PictureDevice {
	public void takePicture();
}

class iPhone implements PictureDevice {
	public void takePicture() {
	}
}

class Camera implements PictureDevice {
	public void takePicture() {
	}
}

public class InterfaceTest {

}

class ChangeNumber {
	void one() {
		int number = 10;
		changeNumber(number);
		System.out.println(number);
	}

	void changeNumber(int number) {
		number = number + 10;
	}
}

class Number {
	int number = 10;
}

class ChangeNumberUsingObject {
	void one() {
		Number number = new Number();
		changeNumber(number);
		System.out.println(number.number);
	}

	void changeNumber(Number number) {
		number.number = number.number + 10;
	}
}

