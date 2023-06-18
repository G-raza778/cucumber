import java.util.ArrayList;

public class Array 
{
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(10);
		a1.add("java");
		a1.add('a');
		a1.add(null);
		a1.add(true);
		a1.add(10);
		a1.add(10);
		a1.add("java");
		a1.add('a');
		a1.add(null);
		a1.add(true);
		a1.add(10);
		a1.add(10);
		a1.add("java");
		a1.add('a');
		a1.add(null);
		a1.add(true);
		a1.remove(6);
		
		System.out.println(a1);
		//System.out.println(a1.removeAll(a1));
		//System.out.println(a1);
		boolean r=a1.contains(10);
		System.out.println(r);
		

	}

}
