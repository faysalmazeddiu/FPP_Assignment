package innerclass;


public class FirstPractice {
    private int outClassval=5;
    
    public int  outerClassMethod() {
    	//System.out.println(outClassval);
    	return outClassval;
    }
    
    InnnerClass innerClassObj;
	
	FirstPractice(){
		innerClassObj=new InnnerClass();
		System.out.println(innerClassObj.innerClassval);
//		innerClassObj.innerClassMethod();
		//innerClassObj.printThisOj();
	}
	 
	public static void main(String[] args) {
		FirstPractice outClassObj=new FirstPractice();

	}
    
	private class InnnerClass {
		static int innerClassval=4;
		
		public void innerClassMethod() {
			System.out.println(outClassval);
			System.out.println(FirstPractice.this);
		}
		
		public void printThisOj() {
			System.out.println(this);
		}
	}
	
	
    
}
