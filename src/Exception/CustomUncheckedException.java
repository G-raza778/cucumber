package Exception;

import java.util.Scanner;

public class CustomUncheckedException {

	public static void main(String[] args) {
		try 
    	{
    		m1();	
		} 
    	catch (Exception e) 
    	{
			System.out.println(e.getMessage());
		}
    }
    public static void m1() 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your age");
    	int age=sc.nextInt();
      	if(age<18)
      	{
      		throw new NotEligibleToVoteException();
      	}
      	else
      	{
      		System.out.println("eligible for vote");
      	}  

	}

}
