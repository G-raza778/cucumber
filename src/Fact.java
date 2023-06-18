
public class Fact
{
	static int num=145,sum=0,temp=num,fact=1,rem,i;
	public static void main(String []args)
	{
       m1();
       if(sum==temp)
		{
		   System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrom number");
		}
	}
	public static void m1()
	{
		i=1;
		fact=1;
		if(num>0)
		{
			rem=num%10;
			if (rem>0)
			  {
		        m2();
			  }
			sum=sum+fact;
			num=num/10;
			m1();
		}
	}
	public static void m2()
	{
	  if(i<=rem)
		{
		 fact=fact*i;
		 i++;
		 m2();
		}	
	}
}