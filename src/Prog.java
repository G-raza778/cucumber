import java.util.HashSet;
import java.util.LinkedHashSet;

public class Prog
{
	public static void main(String[] args) 
	{
		String s="abacbdcbac";
		 HashSet<Character> set = new HashSet<>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<s.length();i++)   
	            set.add(s.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	}
                                                                                                                          