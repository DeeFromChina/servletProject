package javaWebTestProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBHelper {
	
	public static void main(String[] args){
		DBHelper dbHelper = new DBHelper();
		dbHelper.getConnection();
	}

	public Connection getConnection(){
		Connection conn = null;
		String driverManager = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1/u_offer";
		String user = "root"; 
		String password = "945319791"; 
		try {
			Class.forName(driverManager);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public ResultSet executeSql(String sql){
		PreparedStatement pst = null;
		ResultSet resultSet = null;
		try {
			Connection conn = getConnection();
			if(conn == null){
				System.err.println("链接出错！");
				throw new Exception();
			}
			pst = conn.prepareStatement(sql);
			resultSet = pst.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			conn.close();
			pst.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
}
