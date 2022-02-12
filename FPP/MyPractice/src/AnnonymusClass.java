
class Interface {
	void A() {
		System.out.println("This is from A");
	}
}
//class B implements Interface{
//
//	@Override
//	public void A() {
//		System.out.println("This is from B");
//		
//	}
//	
//}
public class AnnonymusClass{
	public static void main(String[] args) {
		new Interface() {
			public void A() {
				System.out.println("This is from Main");
			}
		};
		//A();
	}
}


