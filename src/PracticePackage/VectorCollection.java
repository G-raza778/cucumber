package PracticePackage;

import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {

     Vector v = new Vector();
     v.addElement('a');
     v.addElement("java");
     v.addElement(10);
     v.addElement(true);
     v.addElement(null);
     v.addElement(10);
     System.out.println(v);
//     v.removeElement('a');
//     System.out.println(v);
     System.out.println(v.firstElement());
     System.out.println(v.lastElement());
     System.out.println(v.capacity());
     System.out.println(v.elements());
     System.out.println(v.elementAt(3));
     
   
     

	}

}
