import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Searchframe extends Mainframe {

	JFrame frmSrcTask;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searchframe frame = new Searchframe();
					frame.frmSrcTask.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Searchframe() {
		frmSrcTask = new JFrame();
		frmSrcTask.getContentPane().setBackground(new Color(205, 133, 63));
		frmSrcTask.setTitle("Delete task");
		frmSrcTask.setBounds(100, 50, 350, 250);
		frmSrcTask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSrcTask.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(147, 95, 130, 19);
		frmSrcTask.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTaskName = new JLabel("Task Name");
		lblTaskName.setBackground(new Color(205, 133, 63));
		lblTaskName.setForeground(new Color(139, 0, 0));
		lblTaskName.setBounds(54, 97, 86, 15);
		frmSrcTask.getContentPane().add(lblTaskName);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String key = textField.getText();
			Node selected = list.get(key);
			frmSrcTask.setVisible(false);
			frmToDoList.setVisible(true);
			JOptionPane.showMessageDialog(null, "Name:  " + selected.getName()+"\n Description:  "+ selected.getDescription()
			                                  + "\n Date:  " + selected.getDate() + "\n Duration:  " + selected.getDuration()
			                                  + "\n Priority:  " + selected.getPriority());
			}
		});
		btnSearch.setBounds(117, 151, 117, 25);
		frmSrcTask.getContentPane().add(btnSearch);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setForeground(new Color(139, 0, 0));
		lblSearch.setFont(new Font("Bitstream Charter", Font.BOLD, 26));
		lblSearch.setBounds(123, 30, 170, 44);
		frmSrcTask.getContentPane().add(lblSearch);
	}

}
