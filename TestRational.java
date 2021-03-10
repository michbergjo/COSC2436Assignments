//Michelle Joseph
//13.15 Test Class 

package chpt13;

import java.math.BigInteger;
import java.util.Scanner;

public class TestRational {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt for first rational number 
		System.out.print("Enter the first rational number: ");
		BigInteger n = input.nextBigInteger();
		BigInteger d = input.nextBigInteger();
		
		Rational number1 = new Rational(n,d);
		
		
		//prompt for second rational number 
		System.out.print("Enter the second rational number: ");
		BigInteger n2 = input.nextBigInteger();
		BigInteger d2 = input.nextBigInteger();
		
		Rational number2 = new Rational(n2, d2);
		
		
		//print results
		System.out.println(number1.toString() + " + " + number2.toString() + " = " + number1.add(number2).toString());
		System.out.println(number1.toString() + " - " + number2.toString() + " = " + number1.subtract(number2).toString());
		System.out.println(number1.toString() + " * " + number2.toString() + " = " + number1.multiply(number2).toString());
		System.out.println(number1.toString() + " / " + number2.toString() + " = " + number1.divide(number2).toString());
		System.out.println(number2.toString() + " is " + number2.floatValue());
		
		input.close();
	}

}
