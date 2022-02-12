package Recurrsion;

public class Power {
	public static void main(String[] args) {
		System.out.println(power(2,-5));
	}
	
	public static  double power(double x,int n) {
		if(n<=0) {
			return -1;
		}
		if(n==1) {
			return x;
		}
		return x*power(x, n-1);
	}
}
