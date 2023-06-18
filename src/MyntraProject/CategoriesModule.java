package MyntraProject;

import java.util.Scanner;

public class CategoriesModule {
	static int brand;
	static int size;
	static int gender;
	static int option;
	public static void m5()
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("select option");
		  System.out.println("1.MEN");
		  System.out.println("2.WOMEN");
		  gender=sc.nextInt();
		  switch(gender)
		  {
		  case 1:System.out.println("MEN");
		         m8();
		         break;
		  case 2:System.out.println("WOMEN");
		         break;
		  default:System.out.println("please enter valid option");
		  }
	}
	public static void m8()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select options");
		System.out.println("1.TOPWEAR");
		System.out.println("2.BOTTOMWEAR");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:System.out.println("topwear");
		       m9();
		       break;
		case 2:System.out.println("bottomwear");
		       m12();
		       break;
		default:System.out.println("please enter valid option");
		}
	}
	public static void m9()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select option");
		System.out.println("1.SHIRT");
		System.out.println("2.T-SHIRT");
		 option=sc.nextInt();
		switch(option)
		{
		case 1:System.out.println("shirt");
		       m10();
		       break;
		case 2:System.out.println("t-shirt");
		       m10();
		       break;
		default:System.out.println("please enter valid option");
		}
	}
	public static void m10()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select brand");
		System.out.println("1.ALLEN SOLLY");
		System.out.println("2.WRONG");
		brand=sc.nextInt();
		switch(brand)
		{
		case 1:System.out.println("allen solly");
		       m11();
		       break;
		case 2:System.out.println("wrong");
		       m11();
		       break;
		default:System.out.println("please enter valid option");
		}
	}
	public static void m11()
	{
		Scanner sc=new Scanner(System.in);
	   	System.out.println("select size");
	   	System.out.println("1.LARGE");
	   	System.out.println("2.MEDIUM");
	   	size=sc.nextInt();
	   	switch(size)
	   	{
	   	case 1:System.out.println("large");
	   			if((option==1)&&(size==1||size==2)) {
	   	            CartModule.m13();
	   	            break;
	   			}else
	   	        {
	   	        	CartModule.m14();
	   	        	break;
	   	        }
	   	case 2:System.out.println("medium");
	   	if((option==1)&&(size==1||size==2)) {
	   	       CartModule.m13();
	   	       break;
	   	}
	   	else		
	   	{
	   		CartModule.m14();
	   		break;
	   	} 
	   	default:System.out.println("please enter valid option");
	   	}
	}
	public static void m12()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select option");
		System.out.println("1.JEANS");
		System.out.println("2.FORMAL TROUSERS");
		 option=sc.nextInt();
		switch(option)
		{
		case 1:System.out.println("jeans");
		       m16();
		       break;
		case 2:System.out.println("formal trousers");
		       m16();
		       break;
		default:System.out.println("please enter valid option");
		}
	}
	public static void m16()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select brand");
		System.out.println("1.LEVIS");
		System.out.println("2.WRANGLER");
		brand=sc.nextInt();
		switch(brand)
		{
		case 1:System.out.println("levis");
		       m15();
		       break;
		case 2:System.out.println("wrangler");
		       m15();
		       break;
		default:System.out.println("please enter valid option");
		}
	}
	public static void m15()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select size");
		System.out.println("1.30");
		System.out.println("2.32");
		System.out.println("3.34");
		size=sc.nextInt();
		switch(size)
		{
		case 1:System.out.println("30");
		if((option==1)&&(size==1||size==2||size==3)) {
			CartModule.m17();
			break;}
		else
		{
			CartModule.m18();
		}
		case 2:System.out.println("32");
		if((option==1)&&(size==1||size==2||size==3)) {
			CartModule.m17();
			break;}
		else
		{
			CartModule.m18();
			break;
		}      
		case 3:System.out.println("34");
		if((option==1)&&(size==1||size==2||size==3)) {
			CartModule.m17();
			break;}
		else
		{
			CartModule.m18();
			break;
		}
		default:System.out.println("please enter valid option");
		}
	}

}
