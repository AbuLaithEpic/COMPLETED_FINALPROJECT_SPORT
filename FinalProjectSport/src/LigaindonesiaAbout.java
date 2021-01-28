
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

public class LigaindonesiaAbout extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    eplAbout frame = new eplAbout();
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
    public LigaindonesiaAbout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 692, 440);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        LigaindonesiaAboutChild eac = new  LigaindonesiaAboutChild();
        String about2= eac.printAbout();

        JTextPane txtpnAllInformationAbout = new JTextPane();
        txtpnAllInformationAbout.setFont(new Font("Verdana", Font.PLAIN, 17));
        txtpnAllInformationAbout.setBounds(137, 57, 399, 28);
        contentPane.add(txtpnAllInformationAbout);
        String about1= eac.printAbout();
        txtpnAllInformationAbout.setText("ALL INFORMATION ABOUT LIGA INDONESIA");

        JTextPane textPane_run = new JTextPane();
        textPane_run.setBounds(127, 356, 208, 37);
        contentPane.add(textPane_run);

        JButton btnNewButton_1 = new JButton("return");
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnNewButton_1.setBackground(Color.RED);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setVisible(false);
                dispose();
                LigaindonesiaGUI.main(null);
            }
        });
        btnNewButton_1.setBounds(569, 368, 85, 21);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("RUN");
        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnNewButton_2.setBackground(Color.RED);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LigaindonesiaAboutChild eac = new  LigaindonesiaAboutChild();
                String run = eac.run();
                textPane_run.setText(run);
            }
        });
        btnNewButton_2.setBounds(32, 356, 85, 21);
        contentPane.add(btnNewButton_2);
        LigaindonesiaAboutParent parent = new  LigaindonesiaAboutChild();//overriding
        String contact = parent.printContact();


        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.RED);
        panel_1.setBounds(32, 95, 612, 235);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("OUR FEATURES");
        lblNewLabel_2.setBounds(10, 10, 95, 13);
        panel_1.add(lblNewLabel_2);

        JTextPane textPane_features = new JTextPane();
        textPane_features.setBounds(116, 31, 468, 194);
        panel_1.add(textPane_features);

        JButton btnNewButton = new JButton("Table");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane_features.setText( "TABLE"
                        +"\n\n\nWe will show the current Liga indonesia standings."
                        +"\n\nThe standings will be sorted from the largest points to the lowest points."
                        +"\n\nThere are 20 teams listed in the the table.");
            }
        });
        btnNewButton.setBounds(10, 80, 85, 21);
        panel_1.add(btnNewButton);

        JButton btnNewButton_3 = new JButton("Players");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane_features.setText( "PLAYERS"
                        +"\n\n\nWe will show the players competed in Liga Indonesia teams."
                        +"\n\nIt will show their Name, Positon, Jersey Number, and Age."
                        +"\n\nSince this GUI is new, we only listed players from 2 teams :)");
            }
        });
        btnNewButton_3.setBounds(10, 111, 85, 21);
        panel_1.add(btnNewButton_3);



        JButton btnNewButton_3_1 = new JButton("Matches");
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane_features.setText( "MATCHES"
                        +"\n\n\nThis section will show the upcoming macthes."
                        +"\n\nIt will show the Away and Home teams, and the time the matches start.");
            }
        });
        btnNewButton_3_1.setBounds(10, 204, 85, 21);
        panel_1.add(btnNewButton_3_1);

        JButton btnResults = new JButton("Results");
        btnResults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane_features.setText( "RESULTS"
                        +"\n\n\nThis section will show last matches results.");
            }
        });
        btnResults.setBounds(10, 142, 85, 21);
        panel_1.add(btnResults);

        JButton btnNewButton_4 = new JButton("Top 3");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane_features.setText( "TOP 3"
                        +"\n\n\nThis section will show the top 3 Indonesia teams."
                        +"\n\nIf your team is not in it,don't worry!"
                        +"\n\nYou surely can find your team in the Table section :)");
            }
        });
        btnNewButton_4.setBounds(10, 173, 85, 21);
        panel_1.add(btnNewButton_4);
    }
}