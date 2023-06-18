package PracticePackage;

import java.util.Arrays;

public class Practice6 
{
	public static void main(String[] args) 
	{
		  String s = "java class is going on";	    
		  String [] s1 = s.split(" ");
		  String newString = "";
		  for (String str : s1) 
		   {
			String first = str.substring(0, 1);
			String rest = str.substring(1);
			
			newString+=first.toUpperCase()+rest+" ";
		   }
			System.out.println(newString);
	}	   
}




