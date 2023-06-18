package MyntraProject;

import java.util.Scanner;

public class CartModule {
	public static void m13()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select quantity");
		System.out.println("per item 999");
		int i=sc.nextInt();
			if(i<=10)
			{
		   	   System.out.println(i*999);
			}
			else
			{
			   System.out.println("you can add maximum 10 quantity");
			}
		}
	public static void m14()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select quantity");
		System.out.println("per item 499");
		int i=sc.nextInt();
			if(i<=10)
			{
		    	System.out.println(i*499);
			}
			else
			{
				System.out.println("you can add maximum 10 quantity");
			}
		}
	public static void m17()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select quantity");
		System.out.println("per item 1999");
		int i=sc.nextInt();
			if(i<=10)
			{
		      	System.out.println(i*1999);
			}
			else
			{
				System.out.println("you can add maximum 10 quantity");
			}
		}
	public static void m18()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select quantity");
		System.out.println("per item 1499");
		int i=sc.nextInt();
			if(i<=10)
			{
		   	    System.out.println(i*1499);
			}
			else
			{
				System.out.println("you can add maximum 10 quantity");
			}
		}
	}

