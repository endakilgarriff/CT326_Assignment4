/* 
 * Name: Enda Kilgarriff
 * Student ID: 17351606
 */

import java.text.DecimalFormat;

public class EnumTest {

	static DecimalFormat precision = new DecimalFormat("0.00");

	public static void main(String args[]) {

		System.out.println("Task 1");
		Ball arr[] = Ball.values();

		for (Ball ball : arr) {
			System.out.println(ball.toString());
		}

		System.out.println("\nTask 2");
		System.out.println(Ball.GOLFBALL.name() + " circumference \t" + precision.format(Ball.GOLFBALL.getCircumference()) + " mm");
		System.out.println(Ball.BASEBALL.name() + " diameter \t" + precision.format(Ball.BASEBALL.getVolume()) + " m^3");

	}
}
