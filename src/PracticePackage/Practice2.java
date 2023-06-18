package PracticePackage;

import java.util.Arrays;

public class Practice2 
{
	public static void main(String[] args) 
	{
		 String s=" java class ";
		 System.out.println(s.trim());//string
//		 System.out.println(s.toLowerCase());//string
//		 System.out.println(s.toUpperCase());//string
//		 System.out.println(s.startsWith(" j"));//boolean
//		 System.out.println(s.endsWith("ass "));//boolean
//		 System.out.println(s.charAt(2));//char
//		 System.out.println(s.length());//int
//		 System.out.println(s.replace('j', 'k'));//String
		 
		 StringBuffer sb = new StringBuffer("java");
		 StringBuffer b = new StringBuffer(" class");
		 System.out.println(sb.reverse());
		 //sb.reverse();
		 System.out.println(sb.append(b));
		
		 
		 
	}	
}

