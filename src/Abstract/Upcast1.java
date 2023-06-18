package Abstract;

public class Upcast1 extends Upcast 
{
	public static void main(String[] args) 
	{
       Upcast a=new Upcast1();
       a.m1();
       Upcast a1=(Upcast)new Upcast1();
       a1.m1();
	}
	void m1()
	{
	   System.out.println("child");
	}
}
