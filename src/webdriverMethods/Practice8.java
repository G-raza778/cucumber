package webdriverMethods;
public class Practice8
{
	public static void main(String[] args)
	{		
		System.out.println("main start");
		try
		{
			System.out.println(10/0);
			///////////////////////
			
			int a[]= {1,2,3};
			System.out.println(a[5]);
			for(int i=0; i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("mains end");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}	
}

