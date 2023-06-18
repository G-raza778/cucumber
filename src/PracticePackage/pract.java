package PracticePackage;

import java.util.ArrayList;
import java.util.TreeSet;

public class pract {

	public static void main(String[] args) 
	{
     int a=1211;
     int temp=a;
     int rem=0;
     int sum=0;
     
     while(a>0)
     {
    	 rem=a%10;
    	 sum=sum*10+rem;
    	 a=a/10;
     }
     if(temp==sum)
     {
    	 System.out.println("palindrome");
     }
     else
     {
    	 System.out.println("not a palindrome");
     }
    
  }
}
