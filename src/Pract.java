

public class Pract {

	public static void main(String[] args) {

		String s = "ja0va123cl@#$%a45ss67ABC89";
		
		for(int i=0; i<s.length();i++)
		{
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z')&&!(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
			{
				System.out.print(s.charAt(i));
			}
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			System.out.print(s.charAt(i));
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
	

	

	
	

