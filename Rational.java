//Michelle Joseph
//13.5 Rational Class 

package chpt13;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational>{
	
	//Data fields for numerator and denominator 
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");
	
	//Construct a rational with default properties 
	public Rational() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}
	
	//construct at rational with a specified numerator and denominator 
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		BigInteger negOrPos = BigInteger.valueOf(denominator.intValue() > 0 ? 1 : -1);
		this.numerator = numerator.divide(gcd).multiply(negOrPos);
		this.denominator = denominator.abs().divide(gcd);
	}
	
	//find the greatest common denominator of the two numbers
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		long n1 = n.abs().longValue();
		long n2 = d.abs().longValue();
		BigInteger gcd = BigInteger.ONE;
		
		for(int k = 1; k <= n1 && k <= n2; k++) {
			if(n1 % k == 0 && n2 % k == 0) {
				gcd.setBit(k);
			}
		}
		return gcd;
	}
	
	//return numerator 
	public BigInteger getNumerator() {
		return numerator;
	}
	
	//return denominator 
	public BigInteger getDenominator() {
		return denominator; 
	}
	
	//add a rational number to this rational
	public Rational add(Rational secondRational) {
		BigInteger numTimesSecondDenom = numerator.multiply(secondRational.getDenominator());
		BigInteger denomTimesSecondNum = denominator.multiply(secondRational.getNumerator());
		BigInteger n = ( numTimesSecondDenom.add(denomTimesSecondNum));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		
		return new Rational(n, d);
	}
	
	//subtract a rational number to this rational
	public Rational subtract(Rational secondRational) {
		BigInteger numTimesSecondDenom = numerator.multiply(secondRational.getDenominator());
		BigInteger denomTimesSecondNum = denominator.multiply(secondRational.getNumerator());
		BigInteger n = numTimesSecondDenom.subtract(denomTimesSecondNum);
		BigInteger d = denominator.multiply(secondRational.getDenominator());
	
		return new Rational(n, d);
	}
	 
	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		
		return new Rational(n, d);
	}
	
	@Override 
	public String toString() {
		if(denominator.equals(BigInteger.ONE)) 
			return numerator + "";
		else if (numerator.equals(BigInteger.ZERO))
			return numerator + "";
		else 
			return numerator + "/" + denominator; 
	}
	
	//Override the equals method in the Object class 
	@Override
	public boolean equals(Object other) {
		if(this.subtract((Rational) (other)).getNumerator().equals(BigInteger.ZERO))
			return true;
		else
			return false;
	}
	
	//Implement the compareTo method in Comparable 
	@Override
	public int compareTo(Rational o) {
		if(this.subtract(o).getNumerator().intValue() > 0) 
			return 1;
		else if (this.subtract(o).getNumerator().intValue() < 0) 
			return -1;
		else 
			return 0;
	}
	
	//Implement abstract doubleValue method in Number 
	@Override
	public double doubleValue() {
		return numerator.doubleValue() / denominator.doubleValue();
	}
	
	//Implement abstract floatValue in Number 
	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	//Implement abstract intValue in Number
	@Override
	public int intValue() {
		return (int) doubleValue();
	}
	
	//Implement abstract longValue in Number
	@Override
	public long longValue() {
		return (long) doubleValue();
	}

}
