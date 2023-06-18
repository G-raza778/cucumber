package Practice_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabaseTest {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			// step: create object for driver
			Driver driver = new Driver();

			// step: Register the database
			DriverManager.registerDriver(driver);

			// step: Get connection for the database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hebbal", "root", "root");

			// step: create statement
			Statement state = con.createStatement();
			String query = "select * from student;";

			// step: execute query
			ResultSet result = state.executeQuery(query);
			
			
			while (result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// step: close database connection
			con.close();
		}

	}
}
