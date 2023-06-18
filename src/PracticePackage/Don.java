package PracticePackage;

public class Don 
{
public static void main(String[] args) {
	

	String s = "I love you";
	String s1 [] =s.split(" ");
	String rev = "";
	String rev1 = "";
	for(int i=0;i<s1[0].length();i++)
	{
		rev = rev+s1[0].charAt(i);
		
	}
	for(int i=s1[1].length()-1;i>=0;i--)
	{
		if(i==3)
		{
			rev = rev+" ";
		}
		
		rev = rev+s1[1].charAt(i);
	}
	for(int i=s1[2].length()-1;i>=0;i--)
	{
		if(i==2)
		{
			rev = rev+" ";
		}
		rev =rev+s1[2].charAt(i);
	}
	System.out.println(rev);
  }
}
