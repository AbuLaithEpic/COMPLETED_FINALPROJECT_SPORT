

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLayeredPane;

public class F1About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1About frame = new F1About();
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
	public F1About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		F1About_Child eac = new F1About_Child();
		String about2= eac.printAbout();
		
		JTextPane textPane_aboutUs = new JTextPane();
		textPane_aboutUs.setFont(new Font("Verdana", Font.PLAIN, 17));
		textPane_aboutUs.setBounds(31, 36, 623, 68);
		contentPane.add(textPane_aboutUs);
		String about1= eac.printAbout();
		textPane_aboutUs.setText(about1);

		
		JLabel lblNewLabel = new JLabel("ABOUT US");
		lblNewLabel.setBounds(32, 13, 208, 13);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane_run = new JTextPane();
		textPane_run.setBounds(127, 356, 208, 37);
		contentPane.add(textPane_run);
		
		JButton btnNewButton_1 = new JButton("return");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				F1Menu.main(null);
			}
		});
		btnNewButton_1.setBounds(569, 368, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RUN");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1About_Child eac = new F1About_Child();
				String run = eac.run();
				textPane_run.setText(run);
			}
		});
		btnNewButton_2.setBounds(32, 356, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(429, 114, 225, 235);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(112, 5, 1, 1);
		panel.add(layeredPane);
		
		JLabel lblNewLabel_1 = new JLabel("OWNER");
		lblNewLabel_1.setBounds(16, 10, 199, 13);
		panel.add(lblNewLabel_1);
		
		JTextPane textPane_owner = new JTextPane();
		textPane_owner.setBounds(16, 33, 199, 68);
		panel.add(textPane_owner);
		String ownername=eac.owner("Fikri Putra Ferindra");
		String ownerage=eac.owner("Fikri Putra Ferindra", "19");
		textPane_owner.setText(ownername +"\n"+ ownerage);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTACT");
		lblNewLabel_1_1.setBounds(16, 131, 199, 13);
		panel.add(lblNewLabel_1_1);
		
		JTextPane textPane_contact = new JTextPane();
		textPane_contact.setBounds(16, 154, 199, 68);
		panel.add(textPane_contact);
		F1About_Parent parent = new F1About_Child();//overriding
		String contact = parent.printContact();
		textPane_contact.setText(contact);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(29, 114, 390, 235);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("OUR FEATURES");
		lblNewLabel_2.setBounds(10, 10, 95, 13);
		panel_1.add(lblNewLabel_2);
		
		JTextPane textPane_features = new JTextPane();
		textPane_features.setBounds(115, 31, 265, 194);
		panel_1.add(textPane_features);
		
		JButton btnNewButton = new JButton("Table");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "TABLE"
						+"\n\n\nThis Table Will Show The Leaderboard of The Drivers in Formula one."
						+"\n\nThe Standings will be sorted from the largest points to the lowest points."
						+"\n\nThere Are 20 Driver Listed in The Table.");
			}
		});
		btnNewButton.setBounds(10, 80, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Players");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "PLAYERS"
						+"\n\n\nThis Section Will Show The Drivers based on Their Team."
						+"\n\nIt Will Show Their Name of The Driver, Age, Point, and Country Origin."
						+"\n\nSince This GUI is New, We Only Listed Players From 5 Teams, But We're on Our Way To Collect All The Data.");
			}
		});
		btnNewButton_3.setBounds(10, 111, 85, 21);
		panel_1.add(btnNewButton_3);
		JButton btnNewButton_3_1 = new JButton("Matches");
		btnNewButton_3_1.setForeground(Color.WHITE);
		btnNewButton_3_1.setBackground(Color.DARK_GRAY);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "MATCHES"
						+"\n\n\nThis Section Will Show The Upcoming Race/Round."
						+"\n\nIt Will Show The Place, and The Time The Race is Start.");
			}
		});
		btnNewButton_3_1.setBounds(10, 204, 85, 21);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnResults = new JButton("Results");
		btnResults.setForeground(Color.WHITE);
		btnResults.setBackground(Color.DARK_GRAY);
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "RESULTS"
						+"\n\n\nThis Section Will Show The Last Race Results.");
			}
		});
		btnResults.setBounds(10, 142, 85, 21);
		panel_1.add(btnResults);
		
		JButton btnNewButton_4 = new JButton("Top 3");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "TOP 3"
						+"\n\n\nThis Section Will Show The Top 3 Formula Teams."
						+"\n\nIf your team is not in it,don't worry!"
						+"\n\nYou surely can find your team in the Table section :)");
			}
		});
		btnNewButton_4.setBounds(10, 173, 85, 21);
		panel_1.add(btnNewButton_4);
	}
}
