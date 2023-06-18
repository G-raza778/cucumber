package Exception;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("main start");
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());			
		}
		System.out.println("main ends");
	}
}
