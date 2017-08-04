import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class Data_Viewer extends JFrame {
	JTextArea textArea;

	public Data_Viewer() {

		textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.CENTER);
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_Viewer frame = new Data_Viewer();
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

	private Connection connect() {
		String url = "jdbc:sqlite:C:\\Users\\zzislin\\Desktop\\Changelogs\\clog.db\\";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println("Connection not working" + e.getMessage());
		}
		return conn;
	}

	/*
	 * private static class TableFrame extends public TableFrame() {}
	 */

	public Data_Viewer(String wuddup) throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnExit = new JButton("Exit");
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// panel.dispatchEvent(new WindowEvent(frame,
				// WindowEvent.WINDOW_CLOSING));

				setVisible(false);
				dispose();
			}
		});

		contentPane.add(panel, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		panel_1.setSize(300,200);
		// panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JTextArea textArea = new JTextArea(100, 75);
		textArea.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(textArea);
		panel.add(scroll);

		panel_1.add(textArea);

		Connection conn = this.connect();
		String DateWhereSQL = "SELECT * FROM clogs WHERE Date = '" + wuddup + "' OR Version = '" + wuddup + "'";
		Statement state = conn.createStatement();
		ResultSet set = null;

		set = state.executeQuery(DateWhereSQL);

		while (set.next()) {
			String Date = set.getString("Date");
			String Time = set.getString("Time");
			String IT = set.getString("IT");
			String Budget = set.getString("Budget");
			String Device = set.getString("Device");
			String Process = set.getString("Process");
			String Reason = set.getString("Reason");
			String Issues = set.getString("Issues");
			String Outcome = set.getString("Outcome");
			String Notes = set.getString("Notes");
			String Version = set.getString("Version");
			String Author = set.getString("Author");

			/*
			 * String Date= "SELECT Date FROM clogs WHERE Version = '" + wuddup
			 * + "'"; String Time= "SELECT Time FROM clogs WHERE Version = " +
			 * wuddup + "'"; String IT= "SELECT IT FROM clogs WHERE Version = "
			 * + wuddup + "'"; String Budget=
			 * "SELECT Budget FROM clogs WHERE Version = " + wuddup + "'";
			 * String Device= "SELECT Device FROM clogs WHERE Version = " +
			 * wuddup; String Process=
			 * "SELECT Process FROM clogs WHERE Version = " + wuddup; String
			 * Reason= "SELECT Reason FROM clogs WHERE Version = " + wuddup;
			 * String Issues= "SELECT Issues FROM clogs WHERE Version = " +
			 * wuddup; String Outcome=
			 * "SELECT Outcome FROM clogs WHERE Version = " + wuddup; String
			 * Notes= "SELECT Notes FROM clogs WHERE Version = " + wuddup;
			 * String Version= "SELECT Version FROM clogs WHERE Version = " +
			 * wuddup; String Author=
			 * "SELECT Author FROM clogs WHERE Version = " + wuddup;
			 */

			textArea.setText(

					"Date changelog was created: " + Date + "\n\n" + "Time changelog was created: " + Time + "\n"
							+ "Was the changelog entered into the IT Info Sheet: " + IT + "\n\n"
							+ "Budget iplications of the change(s) made: " + Budget + "\n\n"
							+ "Devices affected by the change(s) made:  " + Device + "\n\n"
							+ "Process of the change(s) made: " + Process + "\n\n" + "Reason for change(s) made: "
							+ Reason + "\n\n" + "Issues encountered with the changer(s) made: " + Issues + "\n\n"
							+ "Ultimate outcome of the change(s) made: " + Outcome + "\n\n" + "Notes: " + Notes + "\n\n"
							+ "Version: " + Version + "\n\n" + "Author: " + Author + "\n\n"

			);
		}

		contentPane.add(panel_1, BorderLayout.CENTER);
	}

}
