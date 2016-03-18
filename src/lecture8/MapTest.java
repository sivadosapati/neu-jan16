package lecture8;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String args[]) {
		Map phoneNumbers = new HashMap();
		phoneNumbers.put(null, null);
		phoneNumbers.put("425-283-7905", "Cva");
		phoneNumbers.put("425-223-6672", "KS");
		phoneNumbers.put("206-612-0768", "Dora");
		phoneNumbers.put("206-612-5482", "Jia");
		phoneNumbers.put("206-369-2606", "LJ");
		phoneNumbers.put("206-604-1898", "Kerwin");
		displayAllKeysAndValuesInMap(phoneNumbers);
		displayAllNames("206", phoneNumbers);
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Please enter phone number for whom you need to know the name..");
		// String phoneNumber = scanner.nextLine();
		// System.out.println(phoneNumbers.get(phoneNumber));
		System.out.println("Size -> " + phoneNumbers.size());
		System.out.println(phoneNumbers.containsValue("Cva"));
		System.out.println(phoneNumbers.containsKey("206-612-0768"));
		phoneNumbers.remove("425-283-7905");
		System.out.println("Size -> " + phoneNumbers.size());
		System.out.println(phoneNumbers.containsValue("Cva"));

	}

	private static void displayAllKeysAndValuesInMap(Map phoneNumbers) {
		for (Object key : phoneNumbers.keySet()) {
			Object value = phoneNumbers.get(key);
			System.out.println(key + " -> " + value);
		}
		System.out.println("------");
	}

	private static void displayAllNames(String searchNumber, Map phoneNumbers) {
		for (Object key : phoneNumbers.keySet()) {
			String phone = (String) key;
			// int numerCount = computerNumberCount(phone);
			// if( numberCount > 15){

			// }
			if (phone.startsWith(searchNumber)) {
				Object name = phoneNumbers.get(phone);
				System.out.println(phone + " -> " + name);
			}
		}
	}
}
