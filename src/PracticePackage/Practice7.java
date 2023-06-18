package PracticePackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice7 
{
	public static void main(String[] args) 
	{	
		LinkedList a = new LinkedList();
		System.out.println(a.isEmpty());
		a.add(10.29);
		a.add('a');
		a.add(25);
		a.add(true);
		a.add("java");
		a.add(38);
		//System.out.println(a);
		a.addFirst("java");
		a.addLast("lion");
		
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		System.out.println("this is first element in array "+a.getFirst());
		System.out.println("this is the last element in array "+a.getLast());
		ArrayList b = new ArrayList(a);
		for(int i=0;i<a.size();i++)
		{
			Object obj = a.get(i);
			if(obj instanceof Integer)
			{
				System.out.println(a.get(i));
			}
		}
		System.out.println(b);
		//foreach loop
		for (Object obj : a) {
			System.out.println(obj);
		}
		Object[] a1 = a.toArray();
		System.out.println("convert to array");
		for(int i=0; i<a1.length;i++)
		{
		  System.out.println(a1[i]);
		}
	}
}


//add
//remove
//contains
//addAll
//removeAll
//containsAll
//retainAll
//isEmpty
//size
//toArray
//Iterator
//clear
