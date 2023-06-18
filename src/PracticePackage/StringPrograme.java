package PracticePackage;

import java.util.Arrays;

public class StringPrograme 
{
	public static void main(String[] args) 
	{	
		String s = "Race";
		String s1 = "Care";
		
		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		
		if(s.length()==s1.length())
		{
			char[] charArray1=s.toCharArray();
			char[] charArray2=s1.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
		
		if(result)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not a anagram");
		}
	  }
		else
		{
			System.out.println("string is not a anagram");
		}
	}  
}      
