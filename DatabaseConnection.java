package jtbcTrain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
	static final String db_url = "jdbc:mysql://localhost/jtbc";
	String user = "root";
	String password = "basdat2020";
	
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	
	public void connect() {
		try {
			connection = DriverManager.getConnection(db_url, user, password);
			System.out.println("Koneksi ke database berhasil!");	
		} catch(Exception e) {
			System.out.println("Terjadi error: "+e.getMessage());
		}
	}
	
	public void disconnect() {
		try {
			connection.close();
			statement.close();
			resultSet.close();
		} catch(Exception e){
			System.out.println("Terjadi error: "+e.getMessage());
		}
	}
	
	public ResultSet readData(String query) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			return resultSet;
		} catch(Exception e) {
			System.out.println("Terjadi error: "+e.getMessage());
		}
		
		return resultSet;
		
	}
}
