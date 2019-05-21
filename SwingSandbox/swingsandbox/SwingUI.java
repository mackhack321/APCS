package swingsandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Label;

public class SwingUI {

	private JFrame frmPersonDatabase;
	/**
	 * @wbp.nonvisual location=124,489
	 */
	private final JFileChooser fileChooser = new JFileChooser();
	private JTextField textFieldName;
	private JTextField textFieldDOB;
	private JTextField textFieldHobby;
	private JComboBox<Integer> comboBoxAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingUI window = new SwingUI();
					window.frmPersonDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public SwingUI() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
		frmPersonDatabase = new JFrame();
		frmPersonDatabase.setTitle("Person Database");
		frmPersonDatabase.setBounds(100, 100, 389, 424);
		frmPersonDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersonDatabase.getContentPane().setLayout(null);
		
		JButton btnChooseFile = new JButton("Import From JSON");
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				fileChooser.showOpenDialog(frmPersonDatabase);
				File selected = fileChooser.getSelectedFile();
				try {
					Person fromJSON = new Person(selected.getName());
					textFieldName.setText(fromJSON.getName());
					comboBoxAge.setSelectedItem(fromJSON.getAge());
					textFieldDOB.setText(fromJSON.getDOB());
					textFieldHobby.setText(fromJSON.getHobby());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnChooseFile.setBounds(210, 148, 146, 23);
		frmPersonDatabase.getContentPane().add(btnChooseFile);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(34, 58, 133, 20);
		frmPersonDatabase.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		comboBoxAge = new JComboBox<>();
		for (int i = 1; i < 101; i++) {comboBoxAge.addItem(i);}
		comboBoxAge.setBounds(71, 110, 65, 22);
		frmPersonDatabase.getContentPane().add(comboBoxAge);
		
		textFieldDOB = new JTextField();
		textFieldDOB.setText("MM/DD/YY");
		textFieldDOB.setColumns(10);
		textFieldDOB.setBounds(34, 175, 133, 20);
		frmPersonDatabase.getContentPane().add(textFieldDOB);
		
		textFieldHobby = new JTextField();
		textFieldHobby.setColumns(10);
		textFieldHobby.setBounds(34, 232, 133, 20);
		frmPersonDatabase.getContentPane().add(textFieldHobby);
		
		Label labelName = new Label("Name");
		labelName.setAlignment(Label.CENTER);
		labelName.setBounds(71, 30, 62, 22);
		frmPersonDatabase.getContentPane().add(labelName);
		
		Label labelAge = new Label("Age");
		labelAge.setAlignment(Label.CENTER);
		labelAge.setBounds(71, 84, 62, 22);
		frmPersonDatabase.getContentPane().add(labelAge);
		
		Label labelDOB = new Label("Date of Birth");
		labelDOB.setAlignment(Label.CENTER);
		labelDOB.setBounds(57, 149, 79, 22);
		frmPersonDatabase.getContentPane().add(labelDOB);
		
		Label labelHobby = new Label("Hobby");
		labelHobby.setAlignment(Label.CENTER);
		labelHobby.setBounds(71, 201, 62, 22);
		frmPersonDatabase.getContentPane().add(labelHobby);
		
		JButton btnWriteToJson = new JButton("Write to JSON");
		btnWriteToJson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Person person = new Person(textFieldName.getText(),(int)(comboBoxAge.getSelectedItem()),textFieldDOB.getText(),textFieldHobby.getText());
				try {
					person.buildJSON();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(frmPersonDatabase,"Person Created and Written to "+person.getName()+".json");
			}
		});
		btnWriteToJson.setBounds(34, 277, 133, 23);
		frmPersonDatabase.getContentPane().add(btnWriteToJson);
	}
}
