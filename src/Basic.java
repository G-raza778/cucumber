
public class Basic
{
	public static void main(String[] args) 
	{	
     	String s="java is class where sir";
//		
//  	  String s1[]=s.split("s"); 
//		  System.out.println(s1.length);
//		 
		int count=1;
		for (int i = 1; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
