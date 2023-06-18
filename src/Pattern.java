import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Pattern {

	public static void main(String[] args) {
		
		HashSet a1=new HashSet();
		a1.add(10);
		a1.add(10);
		a1.add("java");
		a1.add(null);
		a1.add("String");
		a1.add(true);
		a1.add('a');
		a1.add(null);
		System.out.println(a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("search the contain is available in array or not.");
		System.out.println(a1.remove(10));
		System.out.println(a1);
		LinkedHashSet a2=new LinkedHashSet();
		a2.add(10);
		a2.add(10);
		a2.add("java");
		a2.add("String");
		a2.add(null);
		a2.add(true);
		a2.add('a');
		a2.add(null);
		System.out.println(a2);
		for (Object a : a2) {
			System.out.println(a);
		}
	}
}


