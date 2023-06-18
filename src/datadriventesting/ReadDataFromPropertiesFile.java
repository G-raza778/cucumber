package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile 
{
	public static void main(String[] args) throws IOException 
	{
		//Step 1: convert physical file in to java readable object
		//new FileInputStream() throws FileNotFoundException
        FileInputStream fis = new FileInputStream("./testresources/commondata.properties");
        
        //Step 2:Create an instance of properties object
        //properties object should be imported from java.util package
        Properties property = new Properties();
        
        //Step 3: Load all the key-value pairs into properties object
        //The below statement throws IoException
        property.load(fis);
        
        //Step 4: Fetch data using the key
        String url = property.getProperty("url");
        String browser = property.getProperty("browser");
        String user = property.getProperty("username");
        String pwd = property.getProperty("password");
        
        System.out.println(url+"\n"+browser+"\n"+user+"\n"+pwd);   
	}
}
