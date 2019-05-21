package todolist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interface {

	private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public Interface(ListContainer lc) {
		initialize(lc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ListContainer lc) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] headers = new String[] {"Description","Due Date","Owner","ID"};
		Object[][] data = lc.buildArray();
		
		table = new JTable(data,headers);
		frame.add(new JScrollPane(table));
		frame.getContentPane().add(table, BorderLayout.CENTER);
		frame.setTitle("ToDo List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
