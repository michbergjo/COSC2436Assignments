// Michelle Joseph
//10.5 part 2

package chpt10;


public class DisplayPrimeFactors {

	public static void main(String[] args) {
		displayPrimeFactors(120);

	}

	public static void displayPrimeFactors(int number) {
		StackOfIntegers primeFactors = new StackOfIntegers();

		// Prime the number of 2's that divide into the number
		while (number % 2 == 0) {
			primeFactors.push(2);
			number /= 2;
		}

		// n must be odd now
		for (int i = 3; i <= Math.sqrt(number); i++) {

			// while i divides into number, add i to the prime list and divide number
			while (number % i == 0) {
				primeFactors.push(i);
				number /= i;
			}
		}

		// handles exception of number being a prime number
		if (number > 2) {
			primeFactors.push(number);
		}

		StackOfIntegers reversedPrimeFactors = new StackOfIntegers();

		// reverses order of digits
		int size = primeFactors.getSize() - 1;
		for (int i = size; i >= 0; i--) {
			int value = primeFactors.getValue(i);
			reversedPrimeFactors.push(value);
			primeFactors.pop();
		}

		StackOfIntegers.display(reversedPrimeFactors);

	}

}
