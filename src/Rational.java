/* 
 * Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Source: https://introcs.cs.princeton.edu/java/92symbolic/Rational.java.html

public class Rational {

	private int num, den;

	public Rational(int num, int den) {

		if (den == 0) {
			throw new ArithmeticException("Denominator is zero");
		}

		this.num = num;
		this.den = den;
		
//		int g = gcd(num, den);
//		this.num = num / g;
//		this.den = den / g;
	}
	
	public int getNumerator() {
		return num;
	}

	public int getDenominator() {
		return den;
	}

	public Rational multiply(Rational b) {
		Rational a = this;
		Rational c = new Rational(a.num, b.den);
		Rational d = new Rational(b.num, a.den);
		return new Rational(c.num * d.num, c.den * d.den);
	}

	public Rational devide(Rational b) {
		Rational a = this;
		Rational temp = new Rational(b.den, b.num);
		return a.multiply(temp);
	}

	public Rational plus(Rational b) {
		Rational a = this;
		return new Rational((a.num * b.den) + (a.den * b.num), (a.den * b.den));

	}

	public Rational minus(Rational b) {
		Rational a = this;
		return new Rational((a.num * b.den - b.num * a.den), (a.den * b.den));
	}

	static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		return gcd(b, a % b);
	}
	
	public Rational reducedFraction() {
		int temp = gcd(num, den);
		num = num/temp;
		den = den/temp;
		return this;
	}

	public double asDouble() {
		return (double) num / den;
	}

	@Override
	public String toString() {
		return this.num + "/" + this.den;
	}

}
