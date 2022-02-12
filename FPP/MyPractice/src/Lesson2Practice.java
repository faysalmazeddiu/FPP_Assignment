import java.util.Arrays;
import java.util.Date;

public class Lesson2Practice {
	public static void main(String[] a) {
		/*
		String[] strings= {"mazed", "sazed","abir", "billu"};
		
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		double d=2.55555;
//		System.out.println(Math.ceil(d));
//		System.out.println(Math.floor(d));
//		System.out.println((-5)%2);
//		System.out.println((-5)/2);
//		
//		System.out.println(Math.floorMod(-25,6));
//		System.out.println(Math.floorDiv(-5,2));
		//System.out.println(4*5/2-2+2);
		
		*/
		
		
		
		String n= "Mazed";
		//System.out.println(n.substring(2,n.length()));
		System.out.println(n.substring(0,0));
		//System.out.println(n.indexOf('f'));
		String string="Mazed";
		String aString=new String("Mazed");
		String bString=new String("Mazed");
		//System.out.println(aString==bString);
		System.out.println(n==aString);
		
		
		/*
		//System.out.printf("you %s is %d","age",24);
		System.out.printf("you \"%s\" is %d \n","age",24);
		
		String formateString=String.format("you %s is %d \n","age",7);
		System.out.println(formateString);
		String formateString2=String.format("you owe me %s%,d from me","$",1000);
		System.out.println(formateString2);
		String formateString3=String.format("you owe me $ %14.4f ",10.55);
		System.out.println(formateString3);
		
		System.out.printf("you $ %10.3f \n",12.34567);
		
		//System.out.printf("todays date is %td",new Date());
		String formate=String.format("todays date is %tD",new Date());
		System.out.println(formate);
		*/
	}
}


class A{
	public void A(){
		System.out.println("I am A class Constructor");
	}
}

class B extends A{
	public void B(){
		System.out.println("I am B class Constructor");
	}
}
