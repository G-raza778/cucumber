import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args)
	{
      LinkedList l = new LinkedList();
      l.add("java");
      l.add(10);
      l.add('a');
      System.out.println(l);
      l.addFirst("kava");
      l.addLast(true);
      System.out.println(l);
      System.out.println(l.getFirst());
      System.out.println(l.getLast());
      for(Object obj:l)
    	  System.out.println(obj);
      
      
      
      
      
      
     
      
      
      
   }
}
