package prog12_1.closedcurve.good;

public class Square extends ClosedCurve {
	double side;

	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}

	public Square(double side) throws IllegalClosedCurveException {
		if (side < 0) {
			String errMessageString="An IllegalSquareException was thrown in a Square instance!";
			throw new IllegalSquareException(errMessageString);
		}
			
		this.side = side;
	}

	double computeArea() {
		return (side * side);
	}

}
