// Michelle Joseph
//10.3 part 2

package chpt10;

public class IntegerClient {
	
	public static void main(String[] args) {
		//client to test the MyInteger class
		
		MyInteger integer = new MyInteger(19);
		MyInteger integer2 = new MyInteger(22);
		char[] characters = {'3', '7', '9'};
		String numbers = "45678";
		
		System.out.println(integer.isEven());
		System.out.println(integer.isOdd());
		System.out.println(integer.isPrime());
		
		System.out.println(integer2.isEven());
		System.out.println(integer2.isOdd());
		System.out.println(integer2.isPrime());
		
		System.out.println(MyInteger.isEven(19));
		System.out.println(MyInteger.isOdd(19));
		System.out.println(MyInteger.isPrime(19));
		
		System.out.println(MyInteger.isEven(22));
		System.out.println(MyInteger.isOdd(22));
		System.out.println(MyInteger.isPrime(22));
		
		System.out.println(MyInteger.isEven(integer));
		System.out.println(MyInteger.isOdd(integer));
		System.out.println(MyInteger.isPrime(integer));
		
		System.out.println(MyInteger.isEven(integer2));
		System.out.println(MyInteger.isOdd(integer2));
		System.out.println(MyInteger.isPrime(integer2));
		
		System.out.println(integer.equals(19));
		System.out.println(integer.equals(22));
		System.out.println(integer.equals(integer));
		System.out.println(integer.equals(integer2));
		
		System.out.println(MyInteger.parseInt(characters));
		
		System.out.println(MyInteger.parseInt(numbers));
		
		
		
		
	}

}