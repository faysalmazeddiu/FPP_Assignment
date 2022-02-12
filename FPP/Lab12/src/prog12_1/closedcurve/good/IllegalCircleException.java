package prog12_1.closedcurve.good;

public class IllegalCircleException extends IllegalClosedCurveException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalCircleException() {
		super();
	}

	public IllegalCircleException(String errMessage) {
		super(errMessage);
	}

}
