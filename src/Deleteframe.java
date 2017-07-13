import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deleteframe  extends Mainframe{

	JFrame frmDeleteTask;
	private JTextField textField;
	private JLabel lblTaskname;
	private JButton btnDelete;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deleteframe window = new Deleteframe();
					window.frmDeleteTask.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Deleteframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteTask = new JFrame();
		frmDeleteTask.getContentPane().setBackground(new Color(205, 133, 63));
		frmDeleteTask.setTitle("Delete task");
		frmDeleteTask.setBounds(100, 50, 350, 250);
		frmDeleteTask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteTask.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(106, 82, 166, 26);
		frmDeleteTask.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		lblTaskname = new JLabel("TaskName");
		lblTaskname.setBounds(22, 87, 93, 15);
		frmDeleteTask.getContentPane().add(lblTaskname);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = textField.getText();
				list.remove(key);
				frmDeleteTask.setVisible(false);
				frmToDoList.setVisible(true);
				String st = "the selected task is deleted ;)";
				JOptionPane.showMessageDialog(null, st);
			}
		});
		btnDelete.setBounds(106, 143, 117, 25);
		frmDeleteTask.getContentPane().add(btnDelete);
	}
}
