import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F1Table extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1Table frame = new F1Table();
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
	public F1Table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 359);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 527, 268);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", " Lewis Hamilton", " Mercedes", " 347", " England"},
				{"2", " Valtteri Bottas", " Mercedes", " 223", " Poland"},
				{"3", " Max Verstappen ", " Red Bull", " 214", " Netherlands"},
				{"4", " Sergio Purez ", " Racing Point", " 125"," Mexico"},
				{"5", " Daniel Ricciardo", " Renault", " 119"," Australia"},
				{"6", " Carlos Sainz ", " McLaren", " 105"," Spain"},
				{"7", " Alexander Albon", " Red Bull", " 105"," Thailand"},
				{"8", " Charles Leclerc", " Ferrari", " 98"," Monaco"},
				{"9", " Lando Norris", " McLaren", " 97"," England"},
				{"10", " Pierre Gasly", " Scuderia", " 75"," French"},
				{"11", " Johann Zarco", " Renault", " 74"," France"},
				{"12", " Martinoz Kelly", " Mercedes", " 74", " Spain"},
				{"13", " Brad Binder", " Renault", " 63"," South Africa"},
				{"14", " Tito Rabat", " McLaren", " 62"," Spain"},
				{"15", " Bradley Smith", " Scuderia", " 51"," England"},
				{"16", " Alberto Ascari", " Red Bull", " 45"," Italy"},
				{"17", " Iker Lecuona", " McLaren", " 44"," Spain"},
				{"18", " Rio Haryanto", " Manor Racing", " 42"," Indonesia"},
				{"19", " Aleix Esparago", " McLaren", " 36"," Spain"},
				{"20", " Joan Mir", " Racing Point", " 33"," Spain"},
			},
			new String[] {
				"NO", "Drivers Name", "Team", "Final Point","Country Origin"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(19);
		table.getColumnModel().getColumn(2).setPreferredWidth(29);
		table.getColumnModel().getColumn(3).setPreferredWidth(26);
		table.getColumnModel().getColumn(4).setPreferredWidth(26);
		scrollPane.setViewportView(table);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setBackground(Color.DARK_GRAY);
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				F1Menu.main(null);
			}
		});
		btnReturn.setBounds(485, 290, 89, 23);
		contentPane.add(btnReturn);
	}

}
