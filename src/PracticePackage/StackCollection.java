package PracticePackage;

import java.util.Stack;

public class StackCollection 
{
	public static void main(String[] args) 
	{	
		Stack s = new Stack();
		s.push('s');
		s.push("java");
		s.push(10);
		s.push(12.98);
		s.push(10);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.peek();
		System.out.println(s.peek());	
	}
}
