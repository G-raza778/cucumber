package Abstract;

public class M 
{
	static int a=123,sum=0,temp=a,rem=0;
	public static void main(String[] args) 
	{
	    m1();	
	}	
	public static void m1()
	{
		if(a>0)
		{
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
			m1();
		}
		else
		{
			if(sum==temp)
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		}
    }
}
	
