package Abstract;

public abstract class A {
	int x,y=2;
	public static void m3()
	{
		System.out.println("static method");
	}
	final public void m2()
	{
		System.out.println("non static method");
	}
	public A(int x,int y)
	{
		System.out.println(this.x+this.y);
		System.out.println(x+y);
	}
		public abstract void add();
	}

