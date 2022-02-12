import java.sql.Time;

public class Quiz1 {
	public static void main(String[] args) {
		Quiz1 guiz1=new Quiz1();
		guiz1.nine();
	}
	
	public void nine() {
		int loopCount=0;
		double scaler=0.1;
		double x=0.9;
		double y=0.7;
		while(x-scaler != y+scaler) {
			x*=scaler;
			y*=scaler;
			scaler*=scaler;
		}
		System.out.println("time throubh the loop :"+loopCount);
	}
}
