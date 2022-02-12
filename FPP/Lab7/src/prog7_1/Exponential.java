package prog7_1;

public class Exponential {
	public double power(double x, int n) { 
		if(n == 1 ){
            return x;
        }
        if(n<= 0){
            return 1;
        }
        else {
            return x * power(x, n-1);
        }
	}

	public static void main(String[] args) {
		Exponential e = new Exponential();
		
		System.out.println(e.power(5, -1));
		System.out.println(Math.pow(2, 10));
	}
}
