
class MyClass {
	static int amount = 1;

	public static void main(String[] args) {
		System.out.println(amount);
		MyClass myClass=new MyClass();
		myClass.main1();
	}
	
	public void main1() {
		System.out.println(this.amount);
	}
}

/*
 * class MyClass { public static void main(String[] args) { AnotherClass a = new
 * AnotherClass(new MyClass()); a.anotherMethod(); }
 * 
 * void myMethod() { System.out.println("hello"); } }
 * 
 * class AnotherClass { MyClass m;
 * 
 * AnotherClass(MyClass m) { this.m = m; //System.out.println("********");
 * anotherMethod();
 * 
 * }
 * 
 * void anotherMethod() { //System.out.println("***####*****"); m.myMethod(); }
 * }
 */

/*
 * class MyClass { public static void main(String[] args) { AnotherClass a = new
 * AnotherClass(new MyClass()); a.anotherMethod(); }
 * 
 * void myMethod() { System.out.println("hello"); a.anotherMethod(); } }
 * 
 * class AnotherClass { MyClass m;
 * 
 * AnotherClass(MyClass m) { this.m = m; }
 * 
 * void anotherMethod() { System.out.println("hello"); m.myMethod(); } }
 */
