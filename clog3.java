import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.Action;
import javax.swing.JButton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.awt.Color;

import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class clog3 extends JFrame {
	
	
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	private JLabel lblEditedInThe;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private JLabel lblBudgetImplications;
	private JTextField textField_2;
	private JLabel lblServernetworkDevice;
	private JTextField textField_3;
	private JLabel lblProcessOfChanges;
	private JTextField textField_4;
	private JLabel lblNeedreasonsForChange;
	private JTextField textField_5;
	private JLabel lblIssuesproblems;
	private JTextField textField_6;
	private JLabel lblOutcomeresults;
	private JTextField textField_7;
	private JLabel lblNotescommentsotherInfo;
	private JTextField textField_8;
	private JButton btnSaveChangeLog;

	/**
	 * Launch the application.
	 */

	public static int version;
	private JLabel lblVersionNumber;
	private JTextField textField_9;
	private JButton btnNewButton;
	private JLabel lblAuthor;
	private JTextField textField_10;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clog3 frame = new clog3();
					frame.setVisible(true);
					frame.setTitle("Changelog Creator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public clog3() {
		version = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 793);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));

		JLabel lblNewLabel = new JLabel("CHANGE LOG EDITOR ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel, "2, 2");

		label = new JLabel("");
		contentPane.add(label, "6, 4");

		JLabel lblStartDate = new JLabel("Start Date: ");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblStartDate, "2, 6, right, default");

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField, "4, 6, 3, 2, fill, default");
		textField.setColumns(10);

		JLabel lblStartTime = new JLabel("Start Time: ");
		lblStartTime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblStartTime, "2, 8, right, default");

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_1, "4, 8, 3, 2, fill, default");
		textField_1.setColumns(10);

		lblEditedInThe = new JLabel("Edited In the IT Info Sheet?");
		lblEditedInThe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblEditedInThe, "2, 10");

		rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(rdbtnYes, "4, 10");

		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(rdbtnNo, "6, 10");

		lblBudgetImplications = new JLabel("Budget Implication(s): ");
		lblBudgetImplications.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBudgetImplications.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblBudgetImplications, "2, 12");

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_2, "4, 12, 3, 2, fill, default");
		textField_2.setColumns(10);

		lblServernetworkDevice = new JLabel("Server/Network Device: ");
		lblServernetworkDevice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServernetworkDevice.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblServernetworkDevice, "2, 14");

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_3, "4, 14, 3, 2, fill, default");
		textField_3.setColumns(10);

		lblProcessOfChanges = new JLabel("Process of Changes Made: ");
		lblProcessOfChanges.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblProcessOfChanges.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblProcessOfChanges, "2, 16");

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_4, "4, 16, 3, 2, fill, default");
		textField_4.setColumns(10);

		lblNeedreasonsForChange = new JLabel("Need/Reason(s) For Change: ");
		lblNeedreasonsForChange.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNeedreasonsForChange.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNeedreasonsForChange, "2, 18");

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_5, "4, 18, 3, 2, fill, default");
		textField_5.setColumns(10);

		lblIssuesproblems = new JLabel("Issues/Problems: ");
		lblIssuesproblems.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIssuesproblems.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblIssuesproblems, "2, 20");

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_6, "4, 20, 3, 2, fill, default");
		textField_6.setColumns(10);

		lblOutcomeresults = new JLabel("Outcome/Results: ");
		lblOutcomeresults.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOutcomeresults.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblOutcomeresults, "2, 22");

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_7, "4, 22, 3, 2, fill, default");
		textField_7.setColumns(10);

		lblNotescommentsotherInfo = new JLabel("Notes: ");
		lblNotescommentsotherInfo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNotescommentsotherInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNotescommentsotherInfo, "2, 24");

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_8, "4, 24, 3, 2, fill, default");
		textField_8.setColumns(10);

		lblVersionNumber = new JLabel("Version: ");
		lblVersionNumber.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblVersionNumber, "2, 26, right, default");

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(textField_9, "4, 26, 3, 2, fill, default");
		textField_9.setColumns(10);
				
				lblAuthor = new JLabel("Author: ");
				lblAuthor.setHorizontalAlignment(SwingConstants.RIGHT);
				lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 30));
				contentPane.add(lblAuthor, "2, 28, right, default");
				
				textField_10 = new JTextField();
				contentPane.add(textField_10, "4, 28, 3, 2, fill, default");
				textField_10.setColumns(10);
		
				btnSaveChangeLog = new JButton("Save Change Log");
				btnSaveChangeLog.setForeground(Color.RED);
				btnSaveChangeLog.setFont(new Font("Tahoma", Font.PLAIN, 30));
				contentPane.add(btnSaveChangeLog, "2, 30");
				
				btnNewButton = new JButton("View Logs");
				btnNewButton.setForeground(Color.RED);
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
				contentPane.add(btnNewButton, "4, 30, 3, 1");
				
				
				
				
				

				btnNewButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent event) {

try {
	new clogviewer().setVisible(true);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 				
					}

				});

		btnSaveChangeLog.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				try {
					// File file = new File
					// ("*input file path here*");

					PrintWriter writer = new PrintWriter("*input file path here*" + "clog"
							+ textField.getText() + textField_1.getText() + textField_9.getText() + ".txt", "UTF-8");
					writer.println("Version: " + textField_9.getText());
					writer.println("Start Date: " + textField.getText());
					writer.println("Start time: " + textField_1.getText());
					if (rdbtnYes.isSelected()) {
						writer.println("Change was documented in the IT info sheet.");
					}
					if (rdbtnNo.isSelected()) {
						writer.println("Change was NOT documented in the IT info sheet.");
					}
					writer.println("Budget Implecation(S): " + textField_2.getText());
					writer.println("Server/Network Device: " + textField_3.getText());
					writer.println("Process Of Changes Made: " + textField_4.getText());
					writer.println("Need(s)/Reason(s) for Change: " + textField_5.getText());
					writer.println("Issues/Problems: " + textField_6.getText());
					writer.println("Outcome/Results: " + textField_7.getText());
					writer.println("Notes/Comments/Other Info: " + textField_8.getText());
					writer.println("Author of Log: " + textField_10.getText());
					writer.close();

					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_10.setText("");
					
					version++;

				} catch (IOException e) {
					// do something
				}
			}

		});
		
	
		
		
		
		
	}
}
