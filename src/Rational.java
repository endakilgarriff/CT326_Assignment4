/* 
 * Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Source: https://introcs.cs.princeton.edu/java/92symbolic/Rational.java.html

public class Rational {

	// Initialize variables
	private int num, den;

	public Rational(int num, int den) {
		this.num = num;
		this.den = den;
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
