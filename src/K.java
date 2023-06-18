import java.util.Scanner;

public class K 
{
	int a=10;
	public static void main(String[] args) 
	{
		/*String s="java";
		s.concat("class");
		String s2="java";
		String s3="java";	
		s3="mava";
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
//-----------------------------------//		
		K a1=new K();
		K a2=a1;
		K a3=a2;
		a3.a=100;
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a3.a);
//------------------------------------//
		StringBuilder b1=new StringBuilder("java");
		b1.append("class");
		System.out.println(b1);
		StringBuffer b2=new StringBuffer("manual");
		b2.append("class");
		System.out.println(b2);*/
//----------------------------------------//
		int a=10;
		Integer c1=a;
		Integer k1=Integer.valueOf(a);
		System.out.println(c1+" "+a+" "+k1);
		int x=c1;
		int y=c1.intValue();
		System.out.println(x+" "+y);
		double a3=3.12;
		Double c2=a3;
		System.out.println(c2+" "+a3);
		float f=3.2738f;
		Float f1=f;
		System.out.println(f+" "+f1);
		boolean b=true;
		Boolean b1=b;
		System.out.println(b1+" "+b);
		short s=1234;
		Short s1=s;
		System.out.println(s1+" "+s);
		long l=123456789;
		Long l1=l;
		System.out.println(l1+" "+l);
		char c='a';
		Character c3=c;
		System.out.println(c3+" "+c);
	}
}
   


 
