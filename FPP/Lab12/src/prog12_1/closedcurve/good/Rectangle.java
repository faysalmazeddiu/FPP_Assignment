package prog12_1.closedcurve.good;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if (width < 0 || length < 0) {
			String errMessageString="An IllegalRectangleException was thrown in a Rectangle instance!";
			throw new IllegalRectangleException(errMessageString);
		}
		this.length = length;
		this.width = width;
	}
	double computeArea(){
		return width * length;
	}
	


}
