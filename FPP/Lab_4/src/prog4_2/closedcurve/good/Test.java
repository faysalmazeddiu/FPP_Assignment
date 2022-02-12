package prog4_2.closedcurve.good;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)
								 };
		//compute areas
		String string="";
		for(ClosedCurve cc : objects) {
			if(cc instanceof Triangle) {
				string="The area of this Triangle is ";
			}else if(cc instanceof Square) {
				string="The area of this Square is ";
			}
			else if(cc instanceof Rectangle) {
				string="The area of this Rectangle is ";
			}else {
				string="The area of this Circle is ";
			}
			
			System.out.println(string+cc.computeArea());
			string="";
		}
    
	}

}