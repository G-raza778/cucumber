package Abstract;

public class B extends A {
	public B()
	{
		super(10,20);
		System.out.println("inside the constructor");
	}
	public void add()
	{
		System.out.println("override");
	}
	public void m1(int f,int g)
	{
		System.out.println(f+g);
	}
	public static void main(String[] args) {
		B a1=new B();
		a1.add();
		a1.m1(30,40);
		a1.m2();
		m3();
		System.out.println(a1.x+a1.y);
	}
}
