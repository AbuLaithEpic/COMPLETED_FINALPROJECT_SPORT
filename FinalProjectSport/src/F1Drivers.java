import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class F1Drivers extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField show11;
	private JTextField show12;
	private JTextField show13;
	private JTextField show14;
	private JTextField show21;
	private JTextField show22;
	private JTextField show23;
	private JTextField show24;
	private JTextField textField_31;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1Drivers frame = new F1Drivers();
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
	public F1Drivers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 389);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox selectTeam = new JComboBox();
		selectTeam.setModel(new DefaultComboBoxModel(new String[] {"select team", "McLaren", "Ferrari", "Mercedes", "Racing Point", "Red Bull"}));
		selectTeam.setBounds(26, 10, 223, 21);
		contentPane.add(selectTeam);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 64, 680, 26);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Points", "Country"
			}
		));
		scrollPane.setViewportView(table);
		
		show11 = new JTextField();
		show11.setBounds(28, 101, 167, 19);
		contentPane.add(show11);
		show11.setColumns(10);
		
		show12 = new JTextField();
		show12.setBounds(198, 101, 167, 19);
		contentPane.add(show12);
		show12.setColumns(10);
		
		show13 = new JTextField();
		show13.setBounds(371, 101, 160, 19);
		contentPane.add(show13);
		show13.setColumns(10);
		
		show14 = new JTextField();
		show14.setBounds(537, 101, 169, 19);
		contentPane.add(show14);
		show14.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1DriversArrayList plyrList=new F1DriversArrayList();
				
				if(selectTeam.getSelectedIndex()==1) {

					show11.setText(plyrList.liv1[0]);
					show12.setText(plyrList.liv1[1]);
					show13.setText(plyrList.liv1[2]);
					show14.setText(plyrList.liv1[3]);
					show21.setText(plyrList.liv2[0]);
					show22.setText(plyrList.liv2[1]);
					show23.setText(plyrList.liv2[2]);
					show24.setText(plyrList.liv2[3]);

				}else if(selectTeam.getSelectedIndex()==2) {
					show11.setText("Sebastian Vettel");
					show12.setText("33");
					show13.setText("3018");
					show14.setText("Germany");
					show21.setText("Charles Leclerc");
					show22.setText("23");
					show23.setText("401");
					show24.setText("Monaco");
				}else if(selectTeam.getSelectedIndex()==3) {
					show11.setText("Lewis Hamilton");
					show12.setText("36");
					show13.setText("3778");
					show14.setText("United Kingdom");
					show21.setText("Valtteri Bottas");
					show22.setText("31");
					show23.setText("1512");
					show24.setText("Finland");			
				}else if(selectTeam.getSelectedIndex()==4) {
					show11.setText("Sergio Perez");
					show12.setText("30");
					show13.setText("706");
					show14.setText("Mexico");
					show21.setText("Lance Stroll");
					show22.setText("22");
					show23.setText("142");
					show24.setText("Canada");
				}else if(selectTeam.getSelectedIndex()==5) {
					show11.setText("Max Verstappen");
					show12.setText("23");
					show13.setText("1162");
					show14.setText("Netherlands");
					show21.setText("Alexander Albon");
					show22.setText("24");
					show23.setText("197");
					show24.setText("Thailand");
			}
			}
		});
		btnNewButton.setBounds(282, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		show21 = new JTextField();
		show21.setColumns(10);
		show21.setBounds(28, 130, 167, 19);
		contentPane.add(show21);
		
		show22 = new JTextField();
		show22.setColumns(10);
		show22.setBounds(198, 130, 167, 19);
		contentPane.add(show22);
		
		show23 = new JTextField();
		show23.setColumns(10);
		show23.setBounds(371, 130, 160, 19);
		contentPane.add(show23);
		
		show24 = new JTextField();
		show24.setColumns(10);
		show24.setBounds(537, 130, 169, 19);
		contentPane.add(show24);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(24, 42, 726, 238);
		contentPane.add(textField_31);
		
		JButton btnNewButton_2 = new JButton("Return");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				F1Menu.main(null);
			}
		});
		btnNewButton_2.setBounds(661, 312, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
