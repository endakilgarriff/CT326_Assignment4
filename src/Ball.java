public enum Ball {
	BASEBALL(149, 73), 
	BASKETBALL(624, 239), 
	FOOTBALL(450, 216),
	GOLF(46, 43), 
	POOL(156, 60),
	SOFTBALL(180, 97),
	TENNIS(59, 64),
	VOLLEYBALL(260, 218);

	private final double mass, diameter; // In kilograms
	private double radius; 
	
	Ball(double mass, double diameter) {
		this.mass = mass;
		this.diameter = diameter;
		radius = diameter/2;
		
	}
	
	public double mass() { return mass; }
	public double diameter() { return diameter; }
	
	public double getCircumference() {
		return 2.0*Math.PI*radius;
	}
	
	public double getVolume() {
		return (4.0*Math.PI*radius)/3.0;
	}
	
	
	
}

