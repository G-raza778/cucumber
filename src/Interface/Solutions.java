package Interface;
public class Solutions {
	static
	{
		//WIDENING DATA TYPE IMPLICITLY AND EXPLICITLY
	    int a=123456;
	    double b=a;               //implicitly JVM will give the input;
	    double x=(double)a;       //explicitly given by the user;
	    System.out.println(b);
	    System.out.println(x);
	}
	public static void main(String[] args) 
	{
		Solutions a1=new Solutions();
		//narrowing data type done by explicitly
		double b=31234.5;//implicitly cannot happen narrowing data type because of data loose
		int x=(int)b;
		System.out.println(x);
	}	
}

	