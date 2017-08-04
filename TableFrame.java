import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class TableFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableFrame frame = new TableFrame();
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
	
    // SQLite connection string
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
	
	

	
	
	
	public TableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("More Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn(); 
				/*if (row < 0){ 
					row = 0;
				}
				if (col < 0){ 
					col = 0;
				}*/
				String wuddup = (String) table.getValueAt(row, col);
				try {
					new Data_Viewer(wuddup).setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				/* + "Date varchar (100),"
                + "Time varchar (100),"
                + "IT varchar (100),"
                + "Budget varchar (100),"
                + "Device varchar (100),"
                + "Process varchar (5000),"
                + "Reason varchar (100),"
                + "Issues varchar (100),"
                + "Outcome varchr (100),"
                + "Notes varchar (100),"
                + "Version varchar(100),"
                + "Author varchar (100)"
				
				
			String Date= "SELECT Date FROM clogs WHERE Version = " + wuddup;
			String Time= "SELECT Time FROM clogs WHERE Version = " + wuddup;
			String IT= "SELECT IT FROM clogs WHERE Version = " + wuddup;
			String Budget= "SELECT Budget FROM clogs WHERE Version = " + wuddup;
			String Device= "SELECT Device FROM clogs WHERE Version = " + wuddup;
			String Process= "SELECT Process FROM clogs WHERE Version = " + wuddup;
			String Reason= "SELECT Reason FROM clogs WHERE Version = " + wuddup;
			String Issues= "SELECT Issues FROM clogs WHERE Version = " + wuddup;
			String Outcome= "SELECT Outcome FROM clogs WHERE Version = " + wuddup;
			String Notes= "SELECT Notes FROM clogs WHERE Version = " + wuddup;
			String Version= "SELECT Version FROM clogs WHERE Version = " + wuddup;
			String Author= "SELECT Author FROM clogs WHERE Version = " + wuddup;*/
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent arg0){
				panel.setVisible(false);
				dispose(); 
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable( yup());
		scrollPane.setColumnHeaderView(table);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		panel_1.add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton_1 = new JButton("Search");
		panel_1.add(btnNewButton_1);
		
	}

	
	public DefaultTableModel yup(){


		String sql = "SELECT Date, Version FROM clogs";
	    ResultSet rs = null;
	    DefaultTableModel dtm = null;
	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();{

	    try (Connection conn = this.connect();
	         Statement stmt  = conn.createStatement()){
	        rs = stmt.executeQuery(sql);                    // Get rows from database
	        ResultSetMetaData metaData = rs.getMetaData();  // Get meta data rows

	        // Gets column names
	        
	        
	        int columnCount = metaData.getColumnCount();
	        for (int column = 1; column <= columnCount; column++) {
	            columnNames.add(metaData.getColumnName(column));
	        }

	        // iterates through set to the get each row individually
	       while (rs.next()) {
	            Vector<Object> vector = new Vector<Object>();
	            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	                vector.add(rs.getObject(columnIndex));
	            }
	            data.add(vector);
	        }

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }

	    dtm = new DefaultTableModel(data, columnNames);  // Makes new table model for the table components

	    return dtm;
	    
	    
	}
	}   
}
