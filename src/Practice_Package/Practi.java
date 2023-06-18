package Practice_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Practi {
	
	@Test
	public void main() throws SQLException {
		
		//create an instance of driver
		Driver driver = new Driver();
		//register the driver
		DriverManager.registerDriver(driver);
		//get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hebbal","root", "root");
		//create a statement
		Statement state = con.createStatement();
		//update the database
		String query = "insert into student values('dhoni',6,445566773,'ranchi');";
		state.executeUpdate(query);
		//validate the database is updated or not 
		String qury = "select * from student;";
		ResultSet result = state.executeQuery(qury);
		
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
		}
		//close the database connection
		con.close();
	}
}
