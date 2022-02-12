package prog4_5.closedcurve.good;

public interface Polygon {
	
	public double[] getArrayOfSides();
	
	static double  sum(double[] arr) {
		double sumOfArr=0.0;
		for(double val:arr) {
			sumOfArr+=val;
		}
		return sumOfArr;
	}
	
	default double computePerimeter() {
		double sumOfSides=sum(getArrayOfSides());
		return sumOfSides;
	}
}
