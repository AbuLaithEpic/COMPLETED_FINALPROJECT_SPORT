
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class eplPlayers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField getName;
	private JTextField getPos;
	private JTextField getJersey;
	private JTextField getAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplPlayers frame = new eplPlayers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public eplPlayers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(190, 56, 673, 283);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Position", "Jersey No.", "Age"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox selectTeam = new JComboBox();
		selectTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(selectTeam.getSelectedIndex()==1) {
					String filePath = "eplLiverpool.txt";
					File file = new File(filePath);
					try {
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.setRowCount(0);
						BufferedReader br = new BufferedReader(new FileReader(file));
						String firstLine = br.readLine().trim();
						String[] columnsName = firstLine.split(",");
						
						Object[] tableLines = br.lines().toArray();
						
						for(int i=0; i<tableLines.length; i++) {
							String line = tableLines[i].toString().trim();
							String[] dataRow = line.split("/");
							model.addRow(dataRow);
						}
					} catch (FileNotFoundException e1) {	
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if(selectTeam.getSelectedIndex()==2) {
					String filePath = "eplManU.txt";
					File file = new File(filePath);
					try {
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.setRowCount(0);
						BufferedReader br = new BufferedReader(new FileReader(file));
						String firstLine = br.readLine().trim();
						String[] columnsName = firstLine.split(",");

						Object[] tableLines = br.lines().toArray();
						
						for(int i=0; i<tableLines.length; i++) {
							String line = tableLines[i].toString().trim();
							String[] dataRow = line.split("/");
							model.addRow(dataRow);
						}
					} catch (FileNotFoundException e1) {	
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		selectTeam.setModel(new DefaultComboBoxModel(new String[] {"--Select Team--", "Liverpool", "Manchester United"}));
		selectTeam.setBounds(190, 25, 212, 21);
		contentPane.add(selectTeam);
		
		getName = new JTextField();
		getName.setBounds(73, 91, 96, 19);
		contentPane.add(getName);
		getName.setColumns(10);
		
		getPos = new JTextField();
		getPos.setBounds(73, 150, 96, 19);
		contentPane.add(getPos);
		getPos.setColumns(10);
		
		getJersey = new JTextField();
		getJersey.setBounds(73, 215, 96, 19);
		contentPane.add(getJersey);
		getJersey.setColumns(10);
		
		getAge = new JTextField();
		getAge.setBounds(73, 279, 96, 19);
		contentPane.add(getAge);
		getAge.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(10, 94, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("POSITION");
		lblNewLabel_1.setBounds(10, 153, 66, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("JERSEY");
		lblNewLabel_2.setBounds(10, 218, 58, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGE");
		lblNewLabel_3.setBounds(10, 282, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age= getAge.getText();
				String jersey=getJersey.getText();
				int myInteger1 = 0, myInteger2=0;
				try {
				    myInteger1 = Integer.parseInt(age);
				    myInteger2 = Integer.parseInt(jersey);
					
					
					if(selectTeam.getSelectedIndex()==1) {
						try {
							String fileName = "eplLiverpool.txt";
							try {
								File writer = new File(fileName);
								PrintWriter pw = new PrintWriter(new FileOutputStream(writer,true));
								pw.append(getName.getText()+" "+"/"+" "+getPos.getText()+" "+"/"+" "+getJersey.getText()+" "+"/"+" "+getAge.getText()+"\n");
								pw.close();
							} catch (IOException e2) {
								e2.printStackTrace();
							}
						} catch(Exception a){
							JOptionPane.showMessageDialog(null, "PLEASE ENTER AGE IN NUMBER/INTEGER");
						}
					}
					else if(selectTeam.getSelectedIndex()==2) {
						int myInteger = 0;
						try {
							String fileName = "eplManU.txt";
							try {
								File writer = new File(fileName);
								PrintWriter pw = new PrintWriter(new FileOutputStream(writer,true));
								pw.append(getName.getText()+" "+"/"+" "+getPos.getText()+" "+"/"+" "+getJersey.getText()+" "+"/"+" "+getAge.getText()+"\n");
								pw.close();
							} catch (IOException e2) {
								e2.printStackTrace();
							}
						} catch(Exception a){
							JOptionPane.showMessageDialog(null, "PLEASE ENTER AGE IN NUMBER/INTEGER");
						}
					}
					
				} catch(Exception a){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER JERSEY NO. AND AGE IN NUMBER!");
				}

			}
		});
		btnNewButton.setBounds(84, 318, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				eplGUI.main(null);
			}
		});
		btnNewButton_1.setBounds(778, 361, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
