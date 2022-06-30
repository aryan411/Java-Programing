package application;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtil {
	private static boolean isDriverLoaded = false;
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			isDriverLoaded = true;	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	private final static String url="jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
	private final static String user="COMP214_W22_zor_49";
	private final static String password="password";
	private final static String db_name="Dixit";
	
	public static Connection getConnection() throws SQLException{
		Connection con = null;
		if(isDriverLoaded){
			con  = DriverManager.getConnection(url,user,password);
			System.out.println("Connection established");
		}
		return con;
	}
	
	
	public static void closeConnection(Connection con) throws SQLException{
		if(con!=null){
			con.close();
			System.out.println("connection closed");
		}
	}	
}