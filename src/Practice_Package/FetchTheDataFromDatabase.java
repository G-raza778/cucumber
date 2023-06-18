package Practice_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchTheDataFromDatabase {

	public static void main(String[] args) throws SQLException  {
		Connection con = null;
		try
		{
		//step create an instance
		Driver driver = new Driver();
		
		//step register the database
		DriverManager.registerDriver(driver);
		
		//step get the connection from database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hebbal", "root", "root");
		
		//step create a statement
		Statement state = con.createStatement();
		String query = "select * from student;";
		
		//step execute the query
		ResultSet r = state.executeQuery(query);
		
		while(r.next()) {
			System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
		   //close the database
		   con.close();
		}
	}
}
