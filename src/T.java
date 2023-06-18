
 class T 
 {
	int a=5,i=1,fact=1;
	static T a1;
	public static void main(String[] args) 
	{
		 a1=new T();
	    int s=m1();
		System.out.println(s);
    }
	public static int m1()
	{
		
	    if(a1.i<=a1.a)
		{
		 a1.fact=a1.fact*a1.i;
		 a1.i++;
		 m1();
		}
		else
		{
		   
		}
		return a1.fact;
   }
}
