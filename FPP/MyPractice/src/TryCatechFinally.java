
public class TryCatechFinally {
	public static void test() throws Exception {
		try {
			//int c=10/0;
			// return; // 1
			 //System.exit(0); // 2
			 throw new Exception("first"); // 3a
		} catch (Exception x) {
			System.out.println(x.getMessage()+" "+"jk");
			 throw new Exception("second"); // 3b
		} 
		
		finally {
			System.out.println("finally!");
		}
		//System.out.println("last statement");
	}

	public static void main(String[] args) {
		try {
			test();
			
		} catch (Exception x) {
			System.out.println(x.getMessage()+" "+"nnnmm");
		}
		//test();
	}
}
