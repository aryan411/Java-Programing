package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

	private Connection connection;
	ResultSet rs;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DATABASE_URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
	private static final String USER_ID = "COMP214_W22_zor_67";
	private static final String PASSWORD = "password";

	public List<Student> displayStudentInfo(String cityName) {
		List<Student> students = new ArrayList<Student>();
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DATABASE_URL, USER_ID, PASSWORD);
			Statement statement = connection.createStatement();
			rs = statement.executeQuery("select studentID, firstName, lastName, address, city, province, postalCode "
					+ " from Students where city = '" + cityName.trim() + "'");

			while (rs.next()) {
				Student student = new Student(rs.getString("studentID"), rs.getString("firstName"),
						rs.getString("lastName"), rs.getString("address"), rs.getString("city"),
						rs.getString("province"), rs.getString("postalCode"));
				students.add(student);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return students;
	}
}
