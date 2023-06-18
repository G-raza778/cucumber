
public class Sample1 extends Sample {

	public static void main(String[] args) {
	
		Sample a1=new Sample1();//implicit upcasting
		Sample a2=(Sample)new Sample1();//explicitly upcasting
		a1.m1();
	}
	public static void m1()
	{
		System.out.println("child");
	}
}
