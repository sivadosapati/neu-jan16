package lecture10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MenuTest extends JFrame implements MenuListener, ActionListener {

	private JMenuBar menuBar;
	private JMenu file, edit, newMenu;
	private JMenuItem open, javaProject, close;

	public MenuTest() {
		createComponents();
		addComponents();
		addListener();
		makeItVisible();
	}

	private void addListener() {
		// close.addMenuListener(this);
		close.addActionListener(this);
		// this.addWindowListener(this);
		this.addWindowListener(new MyWindowListener());
		open.addActionListener(this);
	}

	private void makeItVisible() {
		setSize(400, 400);
		setVisible(true);
		setLocation(400, 400);

	}

	private void addComponents() {
		setJMenuBar(menuBar);
	}

	private void createComponents() {
		menuBar = new JMenuBar();

		file = new JMenu("File");
		edit = new JMenu("Edit");
		newMenu = new JMenu("New");
		close = new JMenuItem("Close");

		open = new JMenuItem("Open");
		javaProject = new JMenuItem("Java Project");

		menuBar.add(file);
		menuBar.add(edit);
		file.add(newMenu);
		file.add(open);
		file.add(close);
		newMenu.add(javaProject);
	}

	class MyWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Window is closing...");
			System.exit(0);

		}

	}

	public static void main(String[] args) {
		new MenuTest();
	}

	@Override
	public void menuSelected(MenuEvent e) {
		// System.exit(0);

	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == open) {
			JOptionPane.showMessageDialog(null, "Opening new Dialog");
			return;
		}
		if (ae.getSource() == close) {
			System.exit(0);
		}

	}

}
