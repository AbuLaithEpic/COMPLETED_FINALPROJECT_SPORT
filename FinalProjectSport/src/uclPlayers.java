
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class uclPlayers extends JFrame {

private JPanel contentPane;
private JTable table;
private JButton btnNewButton_1;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;


ArrayList<uclPlayersList> pList = new ArrayList<>(); // Array of object
/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				uclPlayers frame = new uclPlayers();
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
public uclPlayers() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 645, 338);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(0, 102, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(186, 11, 439, 237);
	contentPane.add(scrollPane);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"Name", "Position", "Jersey No", "Age"
		}
	));
	scrollPane.setViewportView(table);
	
	btnNewButton_1 = new JButton("RETURN");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contentPane.setVisible(false);
			dispose();
			UCLeague.main(null);
		}
	});
	btnNewButton_1.setBounds(534, 267, 85, 21);
	contentPane.add(btnNewButton_1);
	
	JButton btnNewButton = new JButton("ADD");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
	            saveDataToFile();
	            loadDataFromFile();
	        } catch (IOException ex) {
	            Logger.getLogger(uclPlayers.class.getName()).log(Level.SEVERE, null, ex);
	        }
		}
	});
	btnNewButton.setBounds(10, 199, 78, 23);
	contentPane.add(btnNewButton);
	
	JButton btnNewButton_2 = new JButton("DELETE");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String name = textField.getText();
	        for (uclPlayersList p : pList) {
	            if (p.getName().equals(name)) {
	                pList.remove(p);
	                
	                try {							//Exception handling
	                    updateDataToFile();
	                    loadDataFromFile();

	                } catch (IOException ex) {
	                }
	                return;
	            }
	        }
		}
	});
	btnNewButton_2.setBounds(98, 199, 78, 23);
	contentPane.add(btnNewButton_2);
	
	textField = new JTextField();
	textField.setBounds(90, 37, 86, 20);
	contentPane.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(90, 68, 86, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBounds(90, 99, 86, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	textField_3 = new JTextField();
	textField_3.setBounds(90, 130, 86, 20);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("Name");
	lblNewLabel.setBounds(20, 40, 46, 14);
	contentPane.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Position");
	lblNewLabel_1.setBounds(20, 71, 46, 14);
	contentPane.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Jersey No.");
	lblNewLabel_2.setBounds(20, 102, 60, 14);
	contentPane.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Age");
	lblNewLabel_3.setBounds(20, 133, 46, 14);
	contentPane.add(lblNewLabel_3);
}

public void saveDataToFile() throws IOException {  //File I/O write and read
    String name = textField.getText(); 
    String position = textField_1.getText();
    String jersey = textField_2.getText();
    String age = textField_3.getText();
    uclPlayersList p = new uclPlayersList(name, position, jersey, age);
    pList.add(p); //add object s to array
    File outFile = new File("uclplayers.txt");
    FileWriter outFileStream = new FileWriter(outFile, true);
    PrintWriter outStream = new PrintWriter(outFileStream);
    outStream.println(name);
    outStream.println(position);
    outStream.println(jersey);
    outStream.println(age);
    
    outStream.close();

}

public void loadDataFromFile() throws FileNotFoundException, IOException {
    File inFile = new File("uclplayers.txt");
    if (inFile.exists()) {
        FileReader fileReader = new FileReader(inFile);
        Scanner scanner = new Scanner(inFile);
        pList.clear();
        DefaultTableModel stable = new DefaultTableModel(0, 0);
        String header[] = new String[]{"Name", "Position", "Jersey No", "Age"};
        stable.setColumnIdentifiers(header);
        table.setModel(stable);
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            String position = scanner.nextLine();
            String jersey = scanner.nextLine();
            String age = scanner.nextLine();
            uclPlayersList p = new uclPlayersList(name, position, jersey, age);
            stable.addRow(new Object[]{name, position, jersey, age});
            pList.add(p);
        }
        scanner.close();
        fileReader.close();
        
    } else {
        DefaultTableModel stable = new DefaultTableModel(0, 0);
        String header[] = new String[]{"Time", "Date", "Activity"};
        stable.setColumnIdentifiers(header);
        table.setModel(stable);
    }

}

public void updateDataToFile() throws IOException {

    File outFile = new File("uclplayers.txt");
    FileWriter outFileStream  = new FileWriter(outFile); //replace all data with new
    PrintWriter outStream = new PrintWriter(outFileStream);
    for (uclPlayersList p : pList) {
        outStream.println(p.getName());
        outStream.println(p.getPosition());
        outStream.println(p.getJersey());
        outStream.println(p.getAge());
    }
    outStream.close();
}
}