package prog3_4;

public class Main {
	public static void main(String[] args) {
		
		Triangle triangle=new Triangle(3.4, 3.4);
		System.out.printf("The area of Triangle  %.2f \n", triangle.computeArea());
		
		Rectangle rectangle=new Rectangle(5.5, 5.5);
		System.out.printf("The area of Rectangle %.2f \n", rectangle.computeArea());
		
		Circle circle=new Circle(5.5);
		System.out.printf("The area of Circle  %.2f \n", circle.computeArea());
		
	}
}
