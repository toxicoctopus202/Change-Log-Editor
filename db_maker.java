import java.sql.*; 
public class db_maker {
	
	// Insert data into table
	public static void insert() {

		
	}
	
	public static void createNewTable(){
		// Connection String
		String url = "jdbc:sqlite:C:\\Users\\zzislin\\Desktop\\Changelogs\\clog.db\\";
	
		// SQL statement
		String sql = "CREATE TABLE IF NOT EXISTS clogs ("
			//	+ "ROWID,"
                + "Date varchar (100),"
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
                + ");";	
		try ( Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				Statement slim = conn.createStatement();
				slim.execute(sql); // execute sql 
				System.out.println("Create table executed.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Connect to a sample database
	 *
	 * @param fileName
	 *            the database file name
	 * @return 
	 */
	public static void createNewDatabase(String fileName ) {
		// SQL Connection string
		String url = "jdbc:sqlite:C:\\\\Users\\zzislin\\Desktop\\Changelogs\\\\" + fileName;

		try ( Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		createNewDatabase("clog.db");
		createNewTable(); 


	} 
	}