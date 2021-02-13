//Michelle Joseph
//COSC 2436 Assigment 11.4 Test Class

package chpt11;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMaxElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> userValues = new ArrayList<Integer>();
		
		//Prompt user to enter values 
		System.out.println("Please enter a sequence of numbers ending with 0");
		int value = input.nextInt();
		
		//Continue inputing values to the ArrayList until user enters 0
		while(value != 0) {
			userValues.add(value);
			value = input.nextInt();
		}
		
		//Output the max value from the users list
		 Integer max = MaximumElement.max(userValues);
		 System.out.println("The maximum value of your array is " + max);
		
		input.close();
		

	}

}
