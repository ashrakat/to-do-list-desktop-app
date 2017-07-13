import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.Color;

public class Mainframe {

	JFrame frmToDoList;
	static Map<String, Node> list = new HashMap<String, Node>();
	final JComboBox combo = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void call() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe window = new Mainframe();
					window.frmToDoList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmToDoList = new JFrame();
		frmToDoList.getContentPane().setBackground(new Color(205, 133, 63));
		frmToDoList.getContentPane().setEnabled(false);
		frmToDoList.setTitle("To do list");
		frmToDoList.setBounds(100, 100, 450, 350);
		frmToDoList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmToDoList.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addframe addframe = new Addframe(); 
				frmToDoList.setVisible(false);
				addframe.frmAddTask.setVisible(true);
		        
			}
		});
		btnAdd.setBounds(146, 72, 124, 33);
		frmToDoList.getContentPane().add(btnAdd);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deleteframe deleteframe = new Deleteframe(); 
				frmToDoList.setVisible(false);
				deleteframe.frmDeleteTask.setVisible(true);
			}
		});
		btnNewButton.setBounds(146, 117, 124, 35);
		frmToDoList.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View List");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String[] columns = new String[] {"Name", "description", "date", " duration" , "priority"};
				JTable table = new JTable();
		         
		        frmToDoList.getContentPane().add(new JScrollPane(table));
		       
			}
		});
		btnNewButton_1.setBounds(146, 164, 124, 37);
		frmToDoList.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Searchframe srcframe = new Searchframe(); 
				frmToDoList.setVisible(false);
				srcframe.frmSrcTask.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(146, 213, 124, 35);
		frmToDoList.getContentPane().add(btnNewButton_3);
		JLabel lblNewLabel = new JLabel("My to do list");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Bitstream Charter", Font.BOLD, 26));
		lblNewLabel.setBounds(135, 22, 182, 38);
		frmToDoList.getContentPane().add(lblNewLabel);
		
		JButton btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.clear();
			}
		});
		btnDeleteAll.setBounds(146, 260, 124, 38);
		frmToDoList.getContentPane().add(btnDeleteAll);
	}

}

