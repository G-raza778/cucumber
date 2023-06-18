
public class Encapsulation 
{
	public static void main(String[] args) 
	{	
		Genral a = new Genral();
		a.setUsername("java");
		a.setPassword(123);
        
		if(a.getUsername().equals("java")&& a.getPassword()==123)
		{
			System.out.println("login sucessfully");
		}
		else
		{
			System.out.println("please enter valid credential");
		}
	}
}
