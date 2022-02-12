package prog4_5.closedcurve.good;

public final class Rectangle extends ClosedCurve implements Polygon{
	private double width;
	private double length;
	public Rectangle(double width , double length) {
		this.length=length;
		this.width=width;
	}
	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
//	@Override
//	public int getNumberOfSides() {
//		// TODO Auto-generated method stub
//		return 4;
//	}
	
	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		double[] sideArr=new double[] {width,width,length,length};
		return sideArr;
	}
	

}
