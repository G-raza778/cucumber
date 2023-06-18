
public class S 
{
	static int a=3,i=1,fact=1;
	public static void main(String[] args) 
	{
		m1();	
    }
	public static void m1()
	{
		
	 if(i<=a)
		{
		fact=fact*i;
		 i++;
		 m1();
		}
		 System.out.println(fact);
   }
}


	


