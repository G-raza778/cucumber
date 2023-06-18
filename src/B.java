import java.util.Scanner;

public class B 
{
	static int num,sum=0,rem=0,temp;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		temp=num;
		m1();
		
	}
	public static void m1()
	{
		for(;num>0;)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			m1();	
		}
		if(sum==temp)
		{
           System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a aplindrom");
		}	   
     }
  }


