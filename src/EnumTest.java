
/* 
 * Name: Enda Kilgarriff
 * Student ID: 17351606
 */

import java.text.DecimalFormat;

public class EnumTest {

	// Get doubles to two decimal places
	static DecimalFormat precision = new DecimalFormat("0.00");

	public static void main(String args[]) {

		// Creating array of all Balls in enum
		System.out.println("Enda Kilgarriff - 17351606 Assignment4\nTask 1");
		Ball arr[] = Ball.values();

		// Printing details about all declared balls
		for (Ball ball : arr) {
			System.out.println(ball.toString());
		}

		// Gets circumference and diameter details for desired balls
		System.out.println("\nTask 2");
		System.out.println(Ball.GOLFBALL.name() + " circumference \t"
				+ precision.format(Ball.GOLFBALL.getCircumference()) + " mm");
		System.out
				.println(Ball.BASEBALL.name() + " volume \t" + precision.format(Ball.BASEBALL.getVolume()) + " mm^3");

		// Rational objects created using attributes of balls (r0 is not declared from
		// Ball enum)
		System.out.println("\nTask 3");
		Rational r0 = new Rational(15, 40);
		Rational r1 = new Rational(Ball.BASEBALL.mass(), Ball.BASKETBALL.mass());
		Rational r2 = new Rational(Ball.FOOTBALL.mass(), Ball.GOLFBALL.mass());
		Rational r3 = new Rational(Ball.POOLBALL.diameter(), Ball.SOFTBALL.diameter());
		Rational r4 = new Rational(Ball.TENNISBALL.diameter(), Ball.VOLLEYBALL.diameter());

		// Prints the rational number, then in its reduced form, then in double form to
		// 2 decimal places
		System.out.println(r0 + " = " + r0.reducedFraction().toString() + " = " + precision.format(r0.asDouble()));

		// Prints operation being done to rational numbers, the answer in reduced form ,
		// and answer in double form to 2 decimal places
		printFormat(r1, r2, "+", r1.plus(r2));
		printFormat(r2, r3, "-", r2.minus(r3));
		printFormat(r3, r4, "*", r3.multiply(r4));
		printFormat(r4, r1, "/", r4.devide(r1));

	}

	// Reduces typing necessary and makes test class neater
	public static void printFormat(Rational m, Rational n, String operation, Rational answer) {
		System.out.println(
				"(" + m + ") " + operation + " (" + n + ") = " + answer.reducedFraction().toString() + " = " + precision.format(answer.asDouble()));
	}
}
