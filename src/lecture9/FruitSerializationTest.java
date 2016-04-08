package lecture9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitSerializationTest {
	static final String MANGO_OBJECTS_FILE = "/Users/dosapats/mango.dat";

	public static void main(String args[]) throws Exception {

		ArrayList<Mango> mangos = getExistingMangos();
		printMangos(mangos);
		createNewMangosAndPersistThem(mangos);
	}

	private static void printMangos(List<Mango> mangos) {
		if (mangos.size() == 0) {
			System.out.println("No Mangos on the disk");
			return;
		}
		System.out.println("Mangos stored on the disk..");
		for (Mango mango : mangos) {
			System.out.println(mango);
		}

	}

	private static void createNewMangosAndPersistThem(List<Mango> mangos)
			throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			Mango m = new Mango();
			System.out.println("Enter Price of a new Mango");
			int x = scanner.nextInt();
			m.price = x;
			System.out.println("Enter weight for this Mango");
			m.weight = scanner.nextFloat();
			System.out.println("Enter color for this Mango");
			m.color = scanner.next();
			mangos.add(m);
			persistMangoToFile(mangos);
			List<Mango> mangosFromDisk = getExistingMangos();
			printMangos(mangosFromDisk);
			System.out.println("Enter quit to break or any string to continue");
			String next = scanner.next();

			if (next.equalsIgnoreCase("quit"))
				break;
		}
		scanner.close();
	}

	private static void persistMangoToFile(List<Mango> mangos) throws Exception {
		File file = new File(MANGO_OBJECTS_FILE);
		FileOutputStream fos = new FileOutputStream(file, false);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(mangos);
		oos.close();
		fos.close();
	}

	private static ArrayList<Mango> getExistingMangos() throws Exception {
		File file = new File(MANGO_OBJECTS_FILE);
		if (file.exists() == false) {
			return new ArrayList<Mango>();
		}
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Mango> mangos = (ArrayList<Mango>) ois.readObject();
		ois.close();
		fis.close();
		return mangos;
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
