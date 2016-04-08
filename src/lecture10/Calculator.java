package lecture10;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JTextField one, two, result;
	private JComboBox options;
	private JButton equals, clear;

	public Calculator() {
		setTitle("Calculator");
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}

	private void makeItVisible() {
		this.setSize(500, 500);
		this.setVisible(true);

	}

	private void addListeners() {
		EqualsListener e = new EqualsListener();
		equals.addActionListener(e);

		ClearListener c = new ClearListener();
		clear.addActionListener(c);
	}

	class EqualsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(one.getText());
			int b = Integer.parseInt(two.getText());
			String option = options.getSelectedItem().toString();
			if (option.equals("+")) {
				result.setText((a + b) + "");
			}
			if (option.equals("-")) {
				result.setText((a - b) + "");
			}
			if (option.equals("x")) {
				result.setText((a * b) + "");
			}
			if (option.equals("/")) {
				result.setText((a * 1.0 / b) + "");
			}

		}

	}

	class ClearListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			one.setText("");
			two.setText("");
			result.setText("");

		}
	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		JPanel panel = new JPanel();
		panel.add(one);
		panel.add(options);
		panel.add(two);
		panel.add(equals);
		panel.add(result);
		con.add(panel);
		JPanel anotherPanel = new JPanel();
		anotherPanel.add(clear);
		con.add(anotherPanel);
	}

	private void createComponents() {
		one = new JTextField(10);
		two = new JTextField(10);
		result = new JTextField(10);

		options = new JComboBox();
		options.addItem("+");
		options.addItem("-");
		options.addItem("x");
		options.addItem("/");

		equals = new JButton("=");
		clear = new JButton("Clear");

	}

	public static void main(String[] args) {
		new Calculator();

	}

}
