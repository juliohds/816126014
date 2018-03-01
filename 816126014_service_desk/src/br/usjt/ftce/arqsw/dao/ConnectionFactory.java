package br.usjt.ftce.arqsw.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() throws IOException {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/servicedesk?user=root&password=&useSSL=false");
		} catch (java.sql.SQLException e) {
			// TODO Auto-generated catch block
			throw new IOException(e);
		}
		
		return conn;		
		
	}
	
}
