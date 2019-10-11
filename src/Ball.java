/* 
 * Name: Enda Kilgarriff
 * Student ID: 17351606
 */

public enum Ball {
		BASEBALL(149, 73), 
		BASKETBALL(624, 239), 
		FOOTBALL(450, 216),
		GOLFBALL(46, 43), 
		POOLBALL(156, 60),
		SOFTBALL(180, 97),
		TENNISBALL(59, 64),
		VOLLEYBALL(260, 218);
		
		private final int mass, diameter; // In grams
		private double radius; 
		
		Ball(int mass, int diameter) {
			this.mass = mass;
			this.diameter = diameter;
			radius = diameter/2;
			
		}
		
		public int mass() { return mass; }
		public int diameter() { return diameter; }
		
		public double getCircumference() {
			return 2.0*Math.PI*radius;
		}
		
		public double getVolume() {
			return (4.0*Math.PI*radius)/3.0;
		}
		
		@Override 
		public String toString() {
			return  this.name() + "\t" + mass + " g " + diameter + " mm"; 
		}
	}