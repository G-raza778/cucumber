package brokenLink;

import org.testng.annotations.Test;

public class Odd {

	
	public static void main(String[] args) {
		
	
		
		int num = 4;
		if(num%2==1) {
			for(int i=1;i<=num*2;i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
		}
		else {
			for(int i=1; i<=(num-1)*2;i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
		}
	}
}
