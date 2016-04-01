package lecture9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class FruitSerializationTest {
	static final String MANGO_OBJECTS_FILE = "/Users/dosapats/mango.dat";

	public static void main(String args[]) throws Exception {
		try {
			printExistingMangos();
		} catch (Exception e) {
		}
		createNewMangosAndPersistThem();
	}

	private static void createNewMangosAndPersistThem() throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			Mango m = new Mango();
			System.out.println("Enter Price of a Mango");
			int x = scanner.nextInt();
			m.price = x;
			System.out.println("Enter weight of a Mango");
			m.weight = scanner.nextFloat();
			System.out.println("Enter color of a Mango");
			m.color = scanner.next();
			System.out.println("Enter quit to break or any string to continue");
			String next = scanner.next();
			persistMangoToFile(m);
			
			if (next.equalsIgnoreCase("quit"))
				break;
		}
		scanner.close();
	}

	private static void persistMangoToFile(Mango m) throws Exception {
		File file = new File(MANGO_OBJECTS_FILE);
		FileOutputStream fos = new FileOutputStream(file, true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(m);
		oos.close();
		fos.close();
	}

	private static void printExistingMangos() throws Exception {
		File file = new File(MANGO_OBJECTS_FILE);
		if (file.exists() == false) {
			System.out.println("No Mangos in the system");
			return;
		}
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		while (true) {
			Object o = ois.readObject();
			if (o == null) {
				break;
			}
			Mango m = (Mango) o;
			System.out.println(m.toString());
		}
		ois.close();
		fis.close();
	}
}

class Mango implements Serializable {
	String color;
	int price;
	float weight;

	public String toString() {
		return "Color -> " + color + " Price -> " + price + " Weight -> "
				+ weight;
	}
}
