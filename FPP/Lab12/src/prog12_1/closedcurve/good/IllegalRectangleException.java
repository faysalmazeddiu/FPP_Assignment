package prog12_1.closedcurve.good;

public class IllegalRectangleException extends IllegalClosedCurveException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalRectangleException() {
		super();
	}

	public IllegalRectangleException(String errMessage) {
		super(errMessage);
	}

}
