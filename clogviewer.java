import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JEditorPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;


public class clogviewer extends JFrame {
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clogviewer frame = new clogviewer();
					frame.setVisible(true);
					frame.setTitle("Changelog Viewer");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	File wut = new File("\\\\svr-it\\Store\\IT Intern\\Zachary Zislin\\Changelog\\Logs\\\\");
	final File[] files = wut.listFiles();
	int n = 0;
	String contents = new Scanner(files[n]).useDelimiter("\\Z").next(); 
	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public clogviewer() throws FileNotFoundException {
		/*BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zzislin\\Desktop\\Changelogs"));
		Path p =  Paths.get("C:\\Users\\zzislin\\Desktop\\Changelogs");
		String[] logs = new  String[p.getNameCount()];*/
		
		

		String contents = new Scanner(files[n]).useDelimiter("\\Z").next(); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Prev. Log");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNextLog = new JButton("Next Log ");
		btnNextLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnNextLog, BorderLayout.EAST);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnExit, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JEditorPane dtrpnTest = new JEditorPane();
		dtrpnTest.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dtrpnTest.setText(contents);
		GridBagConstraints gbc_dtrpnTest = new GridBagConstraints();
		gbc_dtrpnTest.gridheight = 4;
		gbc_dtrpnTest.gridwidth = 6;
		gbc_dtrpnTest.fill = GridBagConstraints.BOTH;
		gbc_dtrpnTest.gridx = 0;
		gbc_dtrpnTest.gridy = 0;
		panel.add(dtrpnTest, gbc_dtrpnTest);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		contentPane.add(comboBox, BorderLayout.NORTH);
		comboBox.addItem("Author");
		comboBox.addItem("Date");
		comboBox.addItem("Version"); 
		
	
		
		btnNextLog.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				n++;
				if(n > files.length-1){
					n=files.length-1;
				}
				
				try {
					dtrpnTest.setText( new Scanner(files[n]).useDelimiter("\\Z").next());
				
					
				}
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		});
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				n--;
				if(n < 0){
					n=0;
				}
				try {
				
					
					dtrpnTest.setText( new Scanner(files[n]).useDelimiter("\\Z").next());
					
				
				}
				
				
				
				catch (FileNotFoundException e) {
					// TODO Auto-generatfed catch block
					e.printStackTrace();
				} 
				
				
			}

		});
		

		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
setVisible(false);
dispose();
				
				
			}

		});
		
	}
}

	


