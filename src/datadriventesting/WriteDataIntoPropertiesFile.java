package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertiesFile 
{
	public static void main(String[] args) throws IOException 
	{
		//step 1: convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./testresources/commondata.properties");
        
		//step 2: creat an instance of properties class
		Properties property = new Properties();
		
		//step 3: load all the key value pairs into property object
		property.load(fis);
		
		//step 4: Write data into property file
		property.put("os", "window");
		property.put("browser", "chrome");
		//property.put("b, property)
		
		//step 5: save the change into property file
		FileOutputStream fos = new FileOutputStream("./testresources/commondata.properties");
		property.store(fos, "updated successfully");
		
	}
}
