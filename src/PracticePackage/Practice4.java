package PracticePackage;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4  {

//	public void rbiRoi()
//	{
//		System.out.println("but hdfc is takeing 11% roi");
//	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your user name");
		String user1=sc.next();
		System.out.println("enter your password");
		int pass1=sc.nextInt();
		Practice3 a = new Practice3();
//	    System.out.println(a.getUser());
//	    System.out.println(a.getPass());
//	    a.setUser("java");
//	    a.setPass(456);
//	    System.out.println(a.getPass());
//	    System.out.println(a.getUser());
	    if(a.getUser().equals(user1)&& a.getPass()==pass1)
	    {
	    	System.out.println("login successfuly");
	    }
	    else
	    {
	    	System.out.println("please enter valid credential");
	    }
		
	}
}
