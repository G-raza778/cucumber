package OopsConcept;

public class Main {

	public static void main(String[] args) {
		
		One a=new One();

		a.display();

		Two b=new Two();

		b.display();

		System.out.println(b.m1(4,2));

		System.out.println(b.m1(5.,2.)); //polymorphism

		EncapTest encap = new EncapTest();

		encap.setName("Sandeep's");

		System.out.print("Name : " + encap.getName() );
		Bajaj test = new Bajaj();
		

		test.run();

		}

	}

	


