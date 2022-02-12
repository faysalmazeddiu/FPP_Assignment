package prog12_1.closedcurve.good;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) 
			throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}
	public Circle(double radius) 
			throws IllegalClosedCurveException {
		if (radius < 0) {
			String errString="An IllegalCircleException was thrown in a Circle instance!";
			throw new IllegalCircleException(errString);
		}
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
