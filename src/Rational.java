/* 
 * Name: Enda Kilgarriff
 * Student ID: 17351606
 */

public class Rational {

	// Initialize variables
	private int num, den = 1;

	public Rational(int num, int den) {

		// If the denominator is 0 lets ratio become just be an integer. e.g 5/1 =5
		if (den == 0) {
			this.den = 1;
			this.num = num;
		} else {
			this.num = num;
			this.den = den;
		}

	}

	// Accessor methods
	public int getNumerator() {
		return num;
	}

	public int getDenominator() {
		return den;
	}

	// multiply method does cross multiplication on a and b
	public Rational multiply(Rational b) {
		Rational a = this;
		Rational c = new Rational(a.num, b.den);
		Rational d = new Rational(b.num, a.den);
		return new Rational(c.num * d.num, c.den * d.den);
	}

	// devide method uses multiply method but using the reciprocal of b
	public Rational devide(Rational b) {
		Rational a = this;
		Rational temp = new Rational(b.den, b.num);
		return a.multiply(temp);
	}

	// plus method adds puts the product of the cross multiplication of a and b in
	// the numerator, then puts the product of a and b's denominator in the
	// denominator
	public Rational plus(Rational b) {
		Rational a = this;
		return new Rational((a.num * b.den) + (a.den * b.num), (a.den * b.den));

	}

	// Similar to plus method but subtracts the product in the numerator instead of
	// adding
	public Rational minus(Rational b) {
		Rational a = this;
		return new Rational((a.num * b.den - b.num * a.den), (a.den * b.den));
	}

	// Recursive function finds the greatest common divisor between numerator and
	// denominator
	static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		return gcd(b, a % b);
	}

	// Returns the simplest form of Rational object
	public Rational reducedFraction() {
		int temp = gcd(num, den);
		num = num / temp;
		den = den / temp;
		return this;
	}

	// Returns the ratio as a double
	public double asDouble() {
		return (double) num / den;
	}

	@Override
	public String toString() {
		return this.num + "/" + this.den;
	}

}

/*
 * SOURCES: -
 * https://introcs.cs.princeton.edu/java/92symbolic/Rational.java.html -
 * https://www.youtube.com/watch?v=AsKeji13m4U
 */
