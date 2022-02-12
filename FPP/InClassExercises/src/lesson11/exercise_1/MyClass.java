package lesson11.exercise_1;

public class MyClass {
	private int val;
	public MyClass(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	//implement
//	@Override
//	public int hashCode() {
//		
//	}
	@Override
	public String toString() {
		return "MyClass object #" + val;
	}
	public static void main(String[] args) {
//		MyClass cl1 = new MyClass(1);
//		MyHashtable hashtable = new MyHashtable();
//		hashtable.put(cl1, 1);
		
		for(int i=1;i<=10;++i) {
			//MyClass cl1 = new MyClass(i);
			//new MyHashtable().put(new MyClass(i), i);
			//hashtable.put(cl1, i);
			MyClass cl1 = new MyClass(i);
			MyHashtable hashtable = new MyHashtable();
			hashtable.put(cl1, i);
			hashtable.printTable();
		}
		
	}
}
