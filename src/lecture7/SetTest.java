package lecture7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		//addNamesToDifferentCollections();

		addStudentsToDifferentCollections();
	}

	private static void addStudentsToDifferentCollections() {
		ArrayList list = new ArrayList();
		addStudentsToCollection(list);
		HashSet set = new HashSet();
		addStudentsToCollection(set);
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		addStudentsToCollection(linkedHashSet);
		TreeSet treeSet = new TreeSet();
		addStudentsToCollection(treeSet);

	}

	private static void addNamesToDifferentCollections() {
		ArrayList list = new ArrayList();
		addToCollection(list);
		HashSet set = new HashSet();
		addToCollection(set);
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		addToCollection(linkedHashSet);
		TreeSet treeSet = new TreeSet();
		addToCollection(treeSet);

	}

	private static void addToCollection(Collection c) {
		System.out.println(c.getClass().getSimpleName());
		c.add("siva");
		c.add("dora");
		c.add("siva");
		c.add("jia");
		System.out.println(c.size());
		System.out.println(c);
	}

	private static void addStudentsToCollection(Collection c) {
		System.out.println(c.getClass().getSimpleName());
		c.add(new NEUStudent("siva"));
		c.add(new NEUStudent("dora"));
		c.add(new NEUStudent("siva"));
		c.add(new NEUStudent("jia"));
		System.out.println(c.size());
		System.out.println(c);
	}

}
