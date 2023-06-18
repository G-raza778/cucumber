import java.util.ArrayList;

public class Water 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println(a1 instanceof ArrayList);
		a1.add(10);
		a1.add("java");
		a1.add('a');
		a1.add(true);
	    System.out.println(a1.size());
	    for(int i=0;i<a1.size();i++)
	    {
	    	System.out.println(a1.get(i)+" ");
	    }
	    System.out.println("through foreach loop");
	    for(Object a:a1)
	    {
	    	System.out.println(a+" ");
	    }
	    System.out.println("extract the object with foreach loop");
	    for (Object k : a1)
	    {
		   System.out.print(k+" ");	
		}
	    ArrayList a2 = new ArrayList();
	    a2.add("java");
	    a2.add('a');
	    a2.add(2);
	    System.out.println(a2.size());
	    System.out.println("for loop");
	    for (int i = 0; i < a2.size(); i++) 
	    {
		   System.out.println(a2.get(i));	
		}
	    System.out.println("foreach loop");
	    for (Object j : a2) 
	    {
		   System.out.println(j);	
		}
	    
	    Water s = new Water();
	    System.out.println(s instanceof Water);
	}
}
