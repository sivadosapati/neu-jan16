package lecture10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentRegistrationWindow {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Student Registration");
		JLabel label = new JLabel("Enter Name : ");
		JTextField textField = new JTextField(20);
		textField.setFont(new Font("Arial", Font.BOLD, 34));
		JButton register = new JButton("Register");
		JButton reverse = new JButton("Reverse");

		Container con = frame.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(label);
		con.add(textField);
		con.add(register);
		con.add(reverse);

		ReverseActionListener listener = new ReverseActionListener(textField);

		reverse.addActionListener(listener);

		frame.setSize(400, 400);
		frame.pack();

		frame.setVisible(true);
	}

	static class ReverseActionListener implements ActionListener {

		private JTextField textField;

		public ReverseActionListener(JTextField textField) {
			this.textField = textField;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String string = textField.getText();
			String reverse = new StringBuffer(string).reverse().toString();
			textField.setText(reverse);
		}

	}
}
