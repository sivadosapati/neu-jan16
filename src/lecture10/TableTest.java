package lecture10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableTest extends JFrame implements ActionListener {
	private JTable table;
	private StudentsTableModel tableModel;
	private JButton add, delete;
	private Students students;

	public TableTest(Students students) {
		this.students = students;
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}

	private void makeItVisible() {
		setSize(400, 400);
		setVisible(true);

	}

	private void addListeners() {
		add.addActionListener(this);

	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JScrollPane jsp = new JScrollPane(table);

		con.add(jsp, "Center");

		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(delete);
		con.add(panel, "South");
	}

	private void createComponents() {
		add = new JButton("Add Student");
		delete = new JButton("Delete Student");

		tableModel = new StudentsTableModel(students);
		table = new JTable(tableModel);

	}

	public static void main(String[] args) {
		Students s = new Students();
		s.addStudent(new Student("Kerwin", "A-", "MALE"));
		s.addStudent(new Student("Dora", "A+", "FEMALE"));
		s.addStudent(new Student("KS", "A-", "FEMALE"));

		new TableTest(s);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			students.addRandomStudent();
			System.out.println(students.getCount());
			table.updateUI();
		}

	}

}

class Student {
	String name;
	String grade;
	String gender;

	Student(String name, String grade, String gender) {
		this.name = name;
		this.grade = grade;
		this.gender = gender;
	}
}

class Students {
	Collection<Student> studentsCollection = new ArrayList<Student>();

	void addRandomStudent() {
		Student s = new Student(getRandomName(), getRandomGrade(),
				getRandomGender());
		studentsCollection.add(s);
	}

	private String getRandomGender() {
		int x = (int) (Math.random() * 10);
		if (x < 5) {
			return "MALE";
		} else {
			return "FEMALE";
		}
	}

	private String getRandomName() {
		return "Cva" + Math.random();
	}

	private String getRandomGrade() {
		int x = (int) (Math.random() * 3);
		if (x == 0) {
			return "A";
		}
		if (x == 1) {
			return "A+";
		}
		if (x == 2) {
			return "A-";
		}
		return "B+";
	}

	void addStudent(Student student) {
		studentsCollection.add(student);
	}

	void deleteStudent(Student student) {
		studentsCollection.remove(student);
	}

	int getCount() {
		return studentsCollection.size();
	}

	public Student getStudent(int rowIndex) {
		int counter = 0;
		for (Student s : studentsCollection) {
			if (counter == rowIndex)
				return s;
			counter++;
		}
		return null;
	}
}

class StudentsTableModel implements TableModel {
	private Students students;

	public StudentsTableModel(Students students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.getCount();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Name";
		}
		if (columnIndex == 1) {
			return "Grade";
		}
		if (columnIndex == 2) {
			return "Gender";
		}
		throw new RuntimeException("Invalid column -> " + columnIndex);
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = students.getStudent(rowIndex);
		if (columnIndex == 0) {
			return s.name;
		}
		if (columnIndex == 1) {
			return s.grade;
		}
		if (columnIndex == 2) {
			return s.gender;
		}
		throw new RuntimeException("Invalid column -> " + columnIndex);
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
