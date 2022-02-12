package prog4_2.closedcurve.good;

public final class Rectangle extends ClosedCurve{
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

}
