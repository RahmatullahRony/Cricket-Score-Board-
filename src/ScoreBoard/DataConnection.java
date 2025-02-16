package ScoreBoard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
	private String dbName;
	private String userName;
	private String dbpassword;
	
	public DataConnection(String dbName, String userName, String dbpassword) {
		super();
		this.dbName = dbName;
		this.userName = userName;
		this.dbpassword = dbpassword;
	}
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
		
			connection = DriverManager.getConnection("jdbc:mysql://localhost/"+this.dbName,this.userName,this.dbpassword);
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}