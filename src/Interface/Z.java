package Interface;

public class Z extends Y {

	public static void main(String[] args) {
		
		Y a1=(Y)new Z();
		a1.m1();
	}
	public void m1()
	{
		System.out.println("child");
	}
}
