package Abstract;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bus a1=new Bus();
		System.out.println("enter url");
		String url=sc.next();
		if(a1.getUrl().equals(url))
		{
			System.out.println("Please login to book ticket");
			System.out.println("enter your user name");
			String un=sc.next();
			System.out.println("enter your password");
			int pw=sc.nextInt();
			if(a1.getUn().equals(un)&&(a1.getPw()==pw)) 
			{
				System.out.println("login successfully");
				System.out.println("choose for option");
				System.out.println("1 for bus");
				System.out.println("2 for train");
				System.out.println("3 for flight");
				int option=sc.nextInt();
				switch(option)
				{
				case 1:a1.seat();
				       break;
				case 2:Train a2=new Train();
				       a2.seat();
			           break;
				case 3:Flight a3=new Flight();
				       a3.seat();
				       break;
				default:System.out.println("choose atleast one");
				}
			}
			  else
			     {
				   System.out.println("inter valid credential");
			     }
		      }
		    else
		    {
			System.out.println("enter valid url");
		    }
	    }
    }
