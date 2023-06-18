package PracticePackage;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		
		int num = 100;
		int count1=0;
		for(int i=0;i<num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				count1++;
			}
		}
		System.out.println("the total prime number between 1 to 100 = "+count1);
	}
}
