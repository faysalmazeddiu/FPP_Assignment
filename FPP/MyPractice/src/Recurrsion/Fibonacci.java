package Recurrsion;

public class Fibonacci {
	public static void main(String[] args) {
		//System.out.println(fibo(10));
		fibo(10);
	}
	
	static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}else {
			
			return fibo(n-1)+fibo(n-2);
		}
	}
}
