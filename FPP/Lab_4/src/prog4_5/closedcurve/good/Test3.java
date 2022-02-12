package prog4_5.closedcurve.good;

public class Test3 {
	public static void main(String[] args) 
	{
		Polygon[] objectsOfPoligon = { new Square(3),new Triangle(4, 5, 6), new Rectangle(3, 4) };
		for (Polygon pl : objectsOfPoligon) {
			System.out.println("For this " + pl.getClass().getSimpleName() + "\n\tPerimeter = " + pl.computePerimeter());
		}
	}

}
