package innerclass;

public class StaticInnerClassPractice {
	 int val=5;
	 InnerClass innerObj;
	 StaticInnerClassPractice(){
		 innerObj=new InnerClass();
		 System.out.println(innerObj.val2);
		 System.out.println(innerObj.val3);
	 }
	 
	 public static void main(String[] args) {
		 StaticInnerClassPractice outObjClassPractice=new StaticInnerClassPractice();
		 
		 // way to create object for memeber inner class
		 //StaticInnerClassPractice.InnerClass innerObjClass=outObjClassPractice.new InnerClass();
		 
		 // way to call static inner class
		 StaticInnerClassPractice.InnerClass innerObjClass=new StaticInnerClassPractice.InnerClass();
		 System.out.println(innerObjClass.val3);
		 
		 //outObjClassPractice
	 }
	 static class InnerClass{
		private int val2=9;
		static int val3=3;
		public void printOuterVal() {
			//System.out.print(val); 
			// outer class non static variable is not accessable in static inner class
		}
	 }
}
