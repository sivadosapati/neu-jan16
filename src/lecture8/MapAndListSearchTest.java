package lecture8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import util.Util;

public class MapAndListSearchTest {

	public static void main(String[] args) {
		int size = 5000000;
		ArrayList<Student> studentsList = new ArrayList<Student>(size);
		Map<Integer, Student> studentsMap = new HashMap<Integer, Student>(size);
		for (int i = 1; i < size; i++) {
			Student s = new Student(i, "Student # " + i);
			studentsList.add(s);
			studentsMap.put(s.id, s);
		}
		System.out.println("DONE");

		int randomNumber = Util.getRandomNumber(size);
		searchOnMap(randomNumber, studentsMap);
		searchOnList(randomNumber, studentsList);

	}

	private static void searchOnMap(int randomNumber,
			Map<Integer, Student> studentsMap) {
		long start = System.nanoTime();
		Student student = studentsMap.get(randomNumber);
		long end = System.nanoTime();
		System.out.println("Map -> "
				+ randomNumber + " -> " + student + " -> " + (end - start));
	}

	private static void searchOnList(int randomNumber,
			List<Student> studentsList) {
		long start = System.nanoTime();
		Student student = null;
		for (Student s : studentsList) {
			if (s.id.equals(randomNumber)) {
				student = s;
				break;
			}
		}
		long end = System.nanoTime();
		System.out.println("List -> "
				+ randomNumber + " -> " + student + " -> " + (end - start));
	}

	static class Student {
		Integer id;
		String name;

		Student(Integer id, String name) {
			this.id = id;
			this.name = name;
		}

		public String toString() {
			return id + "->" + name;
		}

	}

}
