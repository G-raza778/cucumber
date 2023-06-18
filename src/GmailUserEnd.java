import java.util.Scanner;

public class GmailUserEnd {

	public static void main(String[] args) {
		GmailAdminEnd a1=new GmailAdminEnd();
	    userlogin();
		 
	}
	public static void m5()
	{
		Scanner sc=new Scanner(System.in);
		
		
	}
	public static void m4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the email-id to send mail");
		String email=sc.next();
		System.out.println("attach the document if you have");
		System.out.println("click on send button");
		System.out.println("message sent");
	}
	public static void m1()
	{
		GmailAdminEnd a1=new GmailAdminEnd();
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter url");
		String url=sc.next();
		if(a1.getUrl().equals(url))
		{
		    System.out.println("login page is open");
		}
	}
	public static void m2()
	{ 
		GmailAdminEnd a1=new GmailAdminEnd();
		Scanner sc=new Scanner(System.in); 
		System.out.println("please enter valid username and paasword");
		System.out.println("now enter the valid username");
	    String username=sc.next();
		 System.out.println("enter your valid password");
		    int password=sc.nextInt();
		    if(a1.getUsername().equals(username)&&a1.getPaassword()==password)
		    {
		    	System.out.println("login successfuly");
		    	System.out.println("now home page display in your screen");
		    	System.out.println("click on compose");
		    	System.out.println("write E-mail whatever you want");
		    	String email=sc.next();
		    	System.out.println("attach if any document you have");
		        System.out.println("click on send button");
		        System.out.println("message sent successfully"); 
		    }
	}
		public static void userlogin() {
		GmailAdminEnd a1=new GmailAdminEnd();
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter url");
		String url=sc.next();
		if(a1.getUrl().equals(url))
		{
		    System.out.println("Welcome to gmail");
		    System.out.println("now enter the valid username");
		    String username=sc.next();
		    System.out.println("enter your valid password");
		    int password=sc.nextInt();
		    if(a1.getUsername().equals(username)&&a1.getPaassword()==password)
		    {
		    	System.out.println("login successfuly");
		    	System.out.println("1.compose");
		    	System.out.println("2.inbox");
		    	System.out.println("3.sent");
		    	System.out.println("4.drafts");
		    	int option=sc.nextInt();
		    	switch(option)
		    	{
		    	case 1:System.out.println("compose page display");
		    	       m4();
		    	       break;
		    	case 2:System.out.println("inbox page display");
		    	       break;
		    	case 3:System.out.println("sent page display");
		    	       break;
		    	case 4:System.out.println("drafts page display");
		    	default:System.out.println("please enter valid option");
		    	} 
		    }
		    else
		    {
		    	System.out.println("two more attemp");
		    	m2();
		    	System.out.println("last attemp");
		    	m2();
		    	System.out.println("reset your password");
		    	int set1=sc.nextInt();
		    	a1.setPassword(set1);
		    	System.out.println( a1.getPaassword());
		        m2();
		    }
		}
		else
		{
			System.out.println("enter valid url");
			m1();
		}
	}
}
