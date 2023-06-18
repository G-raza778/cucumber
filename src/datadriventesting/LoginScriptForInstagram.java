package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptForInstagram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testresources/Data.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        List<String> list = new ArrayList<>();
        for(int i=0;i<4;i++)
        {
        	String data =wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
            list.add(data);
        }  
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(list.get(0));
        long time = Long.parseLong(list.get(3));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
        
        driver.findElement(By.name("username")).sendKeys(list.get(1),Keys.TAB,list.get(2),Keys.ENTER);
        wb.close();
        driver.close();
	}

}
