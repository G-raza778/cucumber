package abstraction;
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("welcome to chrome");
	System.out.println("enter the url");
	String url=sc.next();
	facebook a1=new facebook();
	System.out.println("enter user name");
	String user=sc.next();
	System.out.println("enter password");
	int pw=sc.nextInt();
	if(a1.getUN().equals( user)&& a1.getPassword()==pw)
	{
		System.out.println("login successfull");
	}
	else
	{
		System.out.println("enter valid credentials");
	}
  }
}  