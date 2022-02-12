package prog4_3.employeeinfo;

public class AccountList {
	private final int INITIAL_LENGTH = 4;
	private Account[] accountArray; 
	private int size;
	
	public AccountList() {
		accountArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
		
	public void add(Account s){
		if(size>=accountArray.length) {
			resize();
		}
		accountArray[size++] = s;
	}
	
	public Account get(int i){
		if(i<size) 
			return accountArray[i];
		else {
			System.out.println(" Please give correct index");
			return null;
		}
	}
	
	public boolean find(Account s){
		for (int i =0; i<accountArray.length; i++) {
			if (accountArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(Account s, int pos){
		if(pos<size) accountArray[pos] = s;
		else System.out.println("Please give corrrect index");
		
	}
	
	public boolean remove(Account s){
		boolean remove = false;
		Account []teArr = new Account [size+1];
		for (int i=0, k=0; i<=size; i++) {
			if(!remove && s.equals(accountArray[i])) {
				remove = true;
				continue;
			}
			teArr[k++] = accountArray[i];
		}
		if(remove) {
			size--;
			accountArray = new Account [accountArray.length-1];
			System.arraycopy(teArr, 0, accountArray, 0, size);
		}
		return remove;
	}
		
	private void resize(){
		Account []teArr = new Account [accountArray.length*2];
		System.arraycopy(accountArray, 0, teArr, 0, size);
		accountArray = teArr.clone();
	}	
	
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for (int i=0; i<size; i++) {
			stringBuilder.append(accountArray[i]);
			stringBuilder.append(", ");
		}
		stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	public int size() {
		return size;
	}
}
