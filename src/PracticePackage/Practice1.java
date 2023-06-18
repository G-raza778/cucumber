package PracticePackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Practice1 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
	    h.add('a');
	    h.add("java");
	    h.add('b');
	    h.add(true);
	    h.add(9);
	    h.add(13);
	    Iterator itr = h.iterator();
	    while(itr.hasNext())
	    {
		   Object obj = itr.next();
		   if(obj instanceof Integer)
		   {
			   int x = ((Integer) obj).intValue();
			   int count=0;
			   for(int i=1;i<=x;i++)
			   {
				   if(x%i==0)
				   {
					   count++;
				   }
			   }
			   if(count==2)
			   {
				   System.out.println("prime");
			   }
			   else
			   {
				   System.out.println("not prime");
			   }
		   }
	   }
	}
}

