package PracticePackage;

public class Pra 
{	
	public static void main(String[] args) 
	{
		
		String s = "test yantra";
		StringBuffer sb = new StringBuffer();
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++)
		if(i%2==0&&s.charAt(i)!=' ')
		{
			sb.append(Character.toLowerCase(s.charAt(i)));
			count++;
		}
		else if(i%2==1&&s.charAt(i)!=' ')
		{
			sb.append(Character.toUpperCase(s.charAt(i)));
			count1++;
		}
		System.out.println("Upper case"+count1);
		System.out.println("Lower case"+count);
		System.out.println(sb);
		
	}
}
