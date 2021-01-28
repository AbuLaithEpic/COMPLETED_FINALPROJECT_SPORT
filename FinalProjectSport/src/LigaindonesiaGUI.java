
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class LigaindonesiaGUI extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LigaindonesiaGUI frame = new LigaindonesiaGUI();
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
    public LigaindonesiaGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 718, 455);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("TABLE");
        btnNewButton.setBackground(Color.RED);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaTable table = new LigaindonesiaTable();
                dispose();
                table.setVisible(true);
            }
        });
        btnNewButton.setBounds(288, 253, 105, 47);
        contentPane.add(btnNewButton);

        JButton btnPlayers = new JButton("PLAYERS");
        btnPlayers.setBackground(Color.RED);
        btnPlayers.setForeground(Color.WHITE);
        btnPlayers.setFont(new Font("Dialog", Font.BOLD, 12));
        btnPlayers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaPlayers players = new LigaindonesiaPlayers();
                dispose();
                players.setVisible(true);
            }
        });
        btnPlayers.setBounds(434, 253, 105, 47);
        contentPane.add(btnPlayers);

        JButton btnMatches = new JButton("MATCHES");
        btnMatches.setBackground(Color.RED);
        btnMatches.setForeground(Color.WHITE);
        btnMatches.setFont(new Font("Dialog", Font.BOLD, 12));
        btnMatches.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaMatches matches = new LigaindonesiaMatches();
                dispose();
                matches.setVisible(true);
            }
        });
        btnMatches.setBounds(288, 328, 105, 47);
        contentPane.add(btnMatches);

        JButton btnResults = new JButton("RESULTS");
        btnResults.setBackground(Color.RED);
        btnResults.setForeground(Color.WHITE);
        btnResults.setFont(new Font("Dialog", Font.BOLD, 12));
        btnResults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaResults results = new LigaindonesiaResults();
                dispose();
                results.setVisible(true);
            }
        });
        btnResults.setBounds(434, 328, 105, 47);
        contentPane.add(btnResults);

        JButton btnNewButton_4 = new JButton("return");
        btnNewButton_4.setForeground(Color.WHITE);
        btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 12));
        btnNewButton_4.setBackground(Color.RED);
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setVisible(false);
                dispose();
                MainMenuSport.main(null);
            }
        });
        btnNewButton_4.setBounds(572, 387, 85, 21);
        contentPane.add(btnNewButton_4);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(eplGUI.class.getResource("/Image/liga-shopee-_x300.png")));
        lblNewLabel.setBounds(191, 0, 300, 233);
        contentPane.add(lblNewLabel);

        JButton btnTop = new JButton("TOP 3");
        btnTop.setForeground(Color.WHITE);
        btnTop.setFont(new Font("Dialog", Font.BOLD, 12));
        btnTop.setBackground(Color.RED);
        btnTop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaTop3 top3 = new LigaindonesiaTop3();
                dispose();
                top3.setVisible(true);
            }
        });
        btnTop.setBounds(144, 328, 105, 47);
        contentPane.add(btnTop);

        JButton btnAbout = new JButton("ABOUT");
        btnAbout.setForeground(Color.WHITE);
        btnAbout.setFont(new Font("Dialog", Font.BOLD, 12));
        btnAbout.setBackground(Color.RED);
        btnAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaAbout about = new LigaindonesiaAbout();
                dispose();
                about.setVisible(true);
            }
        });
        btnAbout.setBounds(144, 253, 105, 47);
        contentPane.add(btnAbout);
    }

}