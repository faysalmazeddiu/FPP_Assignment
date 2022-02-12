package prog4_3;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] stringArray; 
	private int size;
	
	public MyStringList() {
		stringArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public boolean remove(String s){
		boolean remove = false;
		String []tArr = new String [size+1];
		for (int i=0, k=0; i<=size; i++) {
			if(!remove && s.equals(stringArray[i])) {
				remove = true;
				continue;
			}
			tArr[k++] = stringArray[i];
		}
		if(remove) {
			size--;
			stringArray = new String [stringArray.length-1];
			System.arraycopy(tArr, 0, stringArray, 0, size);
		}
		return remove;
	}
	
	public void add(String s){
		if(size>=stringArray.length) {
			resize();
		}
		stringArray[size++] = s;
	}
	
	
	
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for (int i=0; i<size; i++) {
			stringBuilder.append(stringArray[i]);
			stringBuilder.append(", ");
		}
		stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	public boolean find(String s){
		for (int i =0; i<stringArray.length; i++) {
			if (stringArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos<size) stringArray[pos] = s;
		else System.out.println("Please give corrrect index");
		
	}
	
	
		
	private void resize(){
		String []tArr = new String [stringArray.length*2];
		System.arraycopy(stringArray, 0, tArr, 0, size);
		stringArray = tArr.clone();
	}	
	
	
	public int size() {
		return size;
	}
	
	public String get(int i){
		if(i<size) 
			return stringArray[i];
		else {
			System.out.println(" Please give correct index");
			return null;
		}
	}
}
