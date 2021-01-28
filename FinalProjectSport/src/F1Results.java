import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class F1Results extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1Results frame = new F1Results();
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
	public F1Results() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 42, 319, 181);
		getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Lewis Hamilton", "1", "41m 23.796s"},
				{"Valtteri Bottas", "2", "41m 28.399s"},
				{"Max Verstappen", "3", "41m 29.742s"},
				{"Sergio Pérez", "4", "41m 30.464s"},
				{"Daniel Ricciardo", "5", "41m 30.644s"},
			},
			new String[] {
				"Driver", "Position", "Time"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(18);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				F1Menu.main(null);
			}
		});
		btnNewButton.setBounds(335, 234, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblRound = new JLabel("Round 1 : Brazil");
		lblRound.setForeground(Color.WHITE);
		lblRound.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRound.setBounds(28, 23, 137, 14);
		contentPane.add(lblRound);
		
	}
}
