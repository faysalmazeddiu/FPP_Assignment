package innerclass;



public class SecondPractice {
	
	public class InnerClass {
		
	}
}

class A{
	SecondPractice outerObjPractice=new SecondPractice();
	
	SecondPractice.InnerClass inerObj=outerObjPractice.new InnerClass(); 
}

class B{
	
}
