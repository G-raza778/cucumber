
public class ReverseString {

	public static void main(String[] args) {
		String s="abc de";    //dec ba;
		String rev="";
		String s1[]=s.split(" ");
		for(int i=s1[0].length()-1; i>=0;i--)
		{
			if(i==1)
			{
				rev=rev+" ";
			}
			rev=rev+s.charAt(i);
		}
		for(int i=s1[1].length()-1; i>=0;i--)
		{
			rev=s1[1].charAt(i)+rev;
		}
		System.out.println(rev);
		
	}
}
