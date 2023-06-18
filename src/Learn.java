

public class Learn 
{
	public static void main(String[]args) 
	{
		// number of word in a string
		String s="java class is going on and on until class is over";
		String s1[]=s.split(" ");
		System.out.println(s1.length);
		
		String f ="java is language";
		int count=1;
		for(int i=0;i<f.length();i++)
		{
		   if((f.charAt(i))==' ')
		   {
			  count++;
		   }
	    }
		System.out.println(count);
	
	}
}

