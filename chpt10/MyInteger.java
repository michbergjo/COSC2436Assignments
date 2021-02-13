// Michelle Joseph
//10.3 part 1

package chpt10;

public class MyInteger {
	
	int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		
		return this.value % 2 == 0;
	}

	public boolean isOdd() {
		
		return this.value % 2 != 0;
	}
	
	public boolean isPrime() {
		for(int i = 2; i < this.value; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true; 
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
				
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}
	
	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}
	
	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger value) {
		return value.equals(this.value);
	}
	
	public static int parseInt(char[] characters) {
		int numbers = Integer.parseInt(new String(characters));
		return numbers;
	}
	
	public static int parseInt(String characters) {
		int numbers = Integer.parseInt(characters);
		return numbers;
	}
}
