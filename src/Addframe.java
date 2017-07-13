import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addframe  extends Mainframe{

	JFrame frmAddTask;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField description;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addframe window = new Addframe();
					window.frmAddTask.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddTask = new JFrame();
		frmAddTask.getContentPane().setBackground(new Color(205, 133, 63));
		frmAddTask.setTitle("Add task");
		frmAddTask.setBounds(100, 100, 450, 350);
		frmAddTask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddTask.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(92, 82, 166, 26);
		frmAddTask.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 158, 166, 26);
		frmAddTask.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 196, 166, 26);
		frmAddTask.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 234, 166, 26);
		frmAddTask.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newTask = new Node();
				Mainframe main = new Mainframe();
				btnNewButton.setEnabled(true);	
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()
					|| textField_2.getText().isEmpty() || textField_3.getText().isEmpty() 
					  || description.getText().isEmpty())
				{
					btnNewButton.setEnabled(false);
				}
				else {
				newTask.setName(textField.getText());
				newTask.setDescription(description.getText());
				newTask.setDate(textField_1.getText());
				newTask.setDuration(Integer.parseInt(textField_2.getText()));
				newTask.setPriority(Integer.parseInt(textField_3.getText()));
				list.put(newTask.getName(), newTask);
				frmAddTask.setVisible(false);
				main.frmToDoList.setVisible(true);
				String st = "the new task is added ;)";
				JOptionPane.showMessageDialog(null, st);
			  }
			}
		});
		btnNewButton.setBounds(285, 269, 117, 25);
		frmAddTask.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(16, 87, 70, 15);
		frmAddTask.getContentPane().add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(16, 163, 70, 15);
		frmAddTask.getContentPane().add(lblDate);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(12, 201, 70, 15);
		frmAddTask.getContentPane().add(lblDuration);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setBounds(16, 239, 70, 15);
		frmAddTask.getContentPane().add(lblPriority);
		
		JLabel lblNewLabel_1 = new JLabel("New Task");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Bitstream Charter", Font.BOLD, 26));
		lblNewLabel_1.setBounds(157, 28, 188, 25);
		frmAddTask.getContentPane().add(lblNewLabel_1);
		
		description = new JTextField();
		description.setColumns(10);
		description.setBounds(92, 120, 166, 26);
		frmAddTask.getContentPane().add(description);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(16, 125, 70, 15);
		frmAddTask.getContentPane().add(lblDescription);
		
	}
}
