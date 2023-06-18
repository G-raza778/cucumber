package Practice_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mysql.cj.jdbc.Driver;

public class Normal {

	@Test
	public void m1() throws Throwable {

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hebbal", "root", "root");
		Statement state = con.createStatement();
		String query = "select * from student;";
		String d = "java";
		String f = "java";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(d, f);
		ResultSet result = state.executeQuery(query);
		while (result.next()) {
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
					+ result.getString(4));
		}
		soft.assertAll();
	}
}
