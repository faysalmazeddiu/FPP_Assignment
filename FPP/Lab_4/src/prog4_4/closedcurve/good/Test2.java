package prog4_4.closedcurve.good;

public class Test2 {
	public static void main(String[] args) {

		Polygon[] objects = {
								 new Square(3),
								 new Triangle(4,5,6),
								 new Rectangle(3,4),
								 
								 };
		//compute areas
		String string="";
		for(Polygon cc : objects) {
			if(cc instanceof Square) {
				string="For this Square \n Number of sides is =";
			}
			else if(cc instanceof Triangle) {
				string="For this Triangle \n Number of sides is =";
			}
			else if(cc instanceof Rectangle) {
				string="For this Rectangle \n Number of sides is =";
			}
			
			System.out.println(string+cc.getNumberOfSides()+" \n Perimeter = "+cc.computePerimeter()+"\n");
			//string="";
		}
    
	}
}
