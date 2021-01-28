import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class F1Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1Menu frame = new F1Menu();
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
	public F1Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("TABLE");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1Table table = new F1Table();
				dispose();
				table.setVisible(true);
			}
		});
		btnNewButton.setBounds(329, 295, 197, 53);
		contentPane.add(btnNewButton);
		
		JButton btnPlayers = new JButton("PLAYERS");
		btnPlayers.setForeground(Color.WHITE);
		btnPlayers.setBackground(Color.DARK_GRAY);
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1Drivers players = new F1Drivers();
				dispose();
				players.setVisible(true);
			}
		});
		btnPlayers.setBounds(329, 370, 197, 47);
		contentPane.add(btnPlayers);
		
		JButton btnMatches = new JButton("MATCHES");
		btnMatches.setForeground(Color.WHITE);
		btnMatches.setBackground(Color.DARK_GRAY);
		btnMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1Matches matches = new F1Matches();
				dispose();
				matches.setVisible(true);
			}
		});
		btnMatches.setBounds(591, 370, 197, 47);
		contentPane.add(btnMatches);
		
		JButton btnResults = new JButton("RESULTS");
		btnResults.setForeground(Color.WHITE);
		btnResults.setBackground(Color.DARK_GRAY);
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1Results results = new F1Results();
				dispose();
				results.setVisible(true);
			}
		});
		btnResults.setBounds(591, 298, 197, 47);
		contentPane.add(btnResults);
		
		JLabel lblNewLabel = new JLabel("");
		Image Image = new ImageIcon(this.getClass().getResource("/unnamed.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(Image));
		lblNewLabel.setBounds(165, 11, 512, 256);
		contentPane.add(lblNewLabel);
		
		JButton btnTop = new JButton("TOP 3");
		btnTop.setForeground(Color.WHITE);
		btnTop.setBackground(Color.DARK_GRAY);
		btnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1Top3 top3 = new F1Top3();
				dispose();
				top3.setVisible(true);
			}
		});
		btnTop.setBounds(64, 370, 197, 47);
		contentPane.add(btnTop);
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setBackground(Color.DARK_GRAY);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1About about = new F1About();
				dispose();
				about.setVisible(true);
			}
		});
		btnAbout.setBounds(64, 298, 197, 47);
		contentPane.add(btnAbout);
	}

}
