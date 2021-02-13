// Michelle Joseph 
//Assignment 9.4

package chpt9;

import java.util.Random;

public class RandomClass {
	
	public static void main(String[] args) {
		
		Random generator = new Random(1000);
		
		System.out.println("Numbers: " );
		for(int i = 0; i < 50; i++) {
			System.out.print(generator.nextInt(100) + " ");
		}
		
	}

}
