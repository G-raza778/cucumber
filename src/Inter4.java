import java.util.Scanner;

public class Inter4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option");
		int a=sc.nextInt();
		Inter1 l;
		switch(a)
		{
		case 1: l=new Inter2();
		        l.m1();
		        break;
		case 2: l=new Inter3();
		        l.m1();
		        break;
		 default:System.out.println("enter valid input");
		}
	}
}
