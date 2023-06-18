package MyntraProject;

import java.util.Scanner;

public class MyntraUserEnd {
	static
	{
		System.out.println("THE CODE IS WRITTEN FOR MYNTRA APPLICATION");
	}
	public static void m7()
	{
		 Scanner sc=new Scanner(System.in);
		 String url=sc.next();
	   	  if(MyntraAdminEnd.getURL().equals(url))
	   	  {
	   		  System.out.println("welcome to myntra");
	   		  System.out.println("enter your ID");
	   		  String id=sc.next();
	   		  System.out.println("enter your password");
	   		  int password=sc.nextInt();
	   		  if(MyntraAdminEnd.getID().equals(id)&&MyntraAdminEnd.getPassword()==password)
	   		  {
	   			  System.out.println("login successfully");
	   			  System.out.println("select modules");
	   			  System.out.println("1.HOME");
	   			  System.out.println("2.CATEGORY");
	   			  System.out.println("3.PROFILE");
	   			  int selectmodule=sc.nextInt();
	   			  switch(selectmodule)
	   			  {
	   			  case 1:System.out.println("home page open");
	   			         break;
	   			  case 2:System.out.println("category");
	   			         CategoriesModule.m5();
	   			         break;
	   			  case 3:System.out.println("profile");
	   			         break;
	   			  default:System.out.println("enter valid option");
	   			  }
	   		  }
	   		  else
	   		  {
	   			  System.out.println("two more attempt left");
	   			  System.out.println("please enter valid credential");
	   			  m6();
	   			  System.out.println("last attempt left");
	   			  System.out.println("please enter valid credential");
	   			  m6();
	   			  System.out.println("reset your password");
	   			  int setpassword=sc.nextInt();
	   			  MyntraAdminEnd.setPassword(setpassword);
		    	  System.out.println( MyntraAdminEnd.getPassword());
		          m6();
	   		  }
	   	  }
	  }
	public static void m6()
	{
	      Scanner sc=new Scanner(System.in);    
	      System.out.println("enter your ID");
		  String id=sc.next();
		  System.out.println("enter your password");
		  int password=sc.nextInt();
		  if(MyntraAdminEnd.getID().equals(id)&&MyntraAdminEnd.getPassword()==password)
		  {
			  System.out.println("login successfully");
			  System.out.println("select modules");
			  System.out.println("1.HOME");
			  System.out.println("2.CATEGORY");
			  System.out.println("3.PROFILE");
			  int selectmodule=sc.nextInt();
			  switch(selectmodule)
			  {
			  case 1:System.out.println("home page open");
			         break;
			  case 2:System.out.println("category");
			  		CategoriesModule.m5();
			          break;
			  case 3:System.out.println("profile");
			         break;
			  default:System.out.println("enter valid option");
             }
		  }
	  }
	 public static void main(String[]args)
     {
   	  Scanner sc=new Scanner(System.in); 
   	  System.out.println("open the browser");
   	  System.out.println("enter the url");
   	  String url=sc.next();
   	  if(MyntraAdminEnd.getURL().equals(url))
   	  {
   		  System.out.println("welcome to myntra");
   		  System.out.println("enter your ID");
   		  String id=sc.next();
   		  System.out.println("enter your password");
   		  int password=sc.nextInt(); 		  
   		  if(MyntraAdminEnd.getID().equals(id)&&MyntraAdminEnd.getPassword()==password)
   		  {
   			  System.out.println("login successfully");
   			  System.out.println("select modules ");
   			  System.out.println("1.HOME");
   			  System.out.println("2.CATEGORY");
   			  System.out.println("3.PROFILE");
   			  int selectmodule=sc.nextInt();
   			  switch(selectmodule)
   			  {
   			  case 1:System.out.println("home page open");
   			         break;
   			  case 2:System.out.println("category");
   			         CategoriesModule.m5();
   			          break;
   			  case 3:System.out.println("profile");
   			         break;
   			  default:System.out.println("enter valid option");
   			  }
   		  }
   		  else
   		  { 
   			  for(int i=0;true;i++)
   			  {
   			      System.out.println("please enter valid credential");
   			      m6();
   			      break;
   			  }
   		  }
   	  }
   	  else
   	  {
   		  System.out.println("enter valid URL");
   		  m7();
   	  }
   }
}
