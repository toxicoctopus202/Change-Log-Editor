import java.awt.BorderLayout;

import java.sql.*;
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
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.Action;
import javax.swing.ButtonGroup;
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

public class CLOG_SQL_v1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					CLOG_SQL_v1 frame = new CLOG_SQL_v1();
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
	public void db(ActionEvent event) {

		new db_maker();
	}

	public CLOG_SQL_v1() {
		version = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 793);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));

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
		rdbtnYes.setSelected(true);

		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(rdbtnNo, "6, 10");

		ButtonGroup buttons = new ButtonGroup();
		buttons.add(rdbtnYes);
		buttons.add(rdbtnNo);

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
		contentPane.add(textField_5, "4, 18, 3,2, fill, default");
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
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
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

				new TableFrame().setVisible(true);

			}
		});

		btnSaveChangeLog.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				String slimshady = " ";
				if (rdbtnYes.isSelected()) {
					slimshady = "'Change was documented in the IT info sheet.'";
				}

				if (rdbtnNo.isSelected()) {
					slimshady = "'Change was not documented in the IT info sheet.'";
				}

				String url = "jdbc:sqlite:C:\\Users\\zzislin\\Desktop\\Changelogs\\clog.db\\";

				/*
				 * String logs =
				 * "INSERT INTO clogs (Date, Time, IT, Budget, Device, Process, Reason, Issues, Outcome, Notes, Version, Author) VALUES ("
				 * + textField.getText() + ", " + textField_1.getText() + ", " +
				 * slimshady + ", " + textField_2.getText() + ", " +
				 * textField_3.getText() + ", " + textField_4.getText() + ", " +
				 * textField_5.getText() + ", " + textField_6.getText() + ", " +
				 * textField_7.getText() + ", " + textField_8.getText() + ", " +
				 * textField_9.getText() + ", " + textField_10.getText() + ")";
				 */

				String logs = "INSERT INTO clogs (Date,Time,IT,Budget,Device,Process,Reason,Issues,Outcome,Notes,Version,Author) VALUES ("
						+ "'" + textField.getText() + "'" + "," + "'" + textField_1.getText() + "'" + "," + slimshady
						+ "," + "'" + textField_2.getText() + "'" + "," + "'" + textField_3.getText() + "'" + "," + "'"
						+ textField_4.getText() + "'" + "," + "'" + textField_5.getText() + "'" + "," + "'"
						+ textField_6.getText() + "'" + "," + "'" + textField_7.getText() + "'" + "," + "'"
						+ textField_8.getText() + "'" + "," + "'" + textField_9.getText() + "'" + "," + "'"
						+ textField_10.getText() + "'" + ")";

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

				try (Connection conn = DriverManager.getConnection(url)) {
					if (conn != null) {
						Statement slim = conn.createStatement();
						slim.execute(logs); // execute sql
						System.out.println("Create table executed.");
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());

				}

			}

		});

	}
}
