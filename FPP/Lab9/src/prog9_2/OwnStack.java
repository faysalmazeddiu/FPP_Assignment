package prog9_2;

public class OwnStack {
	
	private static final int LENGTH = 500;
	private int topper = -1;
	private int nextVal = 0;
	private Character [] charecterArray = new Character[LENGTH];
	
	
	void makeEmpty() {
		topper = -1;
		nextVal = 0;
	}
	
	public char pop() {
		Character charec = peek();
		if (charec != '\0') {
			charecterArray[topper] = '\0';
			topper--;
			nextVal--;
		}
		return charec;
	}
	
	boolean isStachEmpty() {
		
		if(topper == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public Character peek() {
		if(topper == -1) {
			return '\0';
			
		}else {
			return charecterArray[topper];
		}
	}
	
	
	
	public void push(Character chrecter) {
		if (checkingDelimiters(chrecter)==false) {
			return;
		} 
		charecterArray[nextVal] = chrecter;
		topper++;
		nextVal++;
	}
	
	
	
	
	
	boolean checkingDelimiters(Character charecter) {
		
		if(charecter=='[' || charecter==']' || charecter=='{' || charecter=='}' || charecter=='<' || charecter=='>' || charecter=='(' || charecter==')') {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		if (topper == -1) return "<empty>";
		StringBuilder stringBuilder = new StringBuilder();
		for (Character value : charecterArray) {
			if (value != null) {
				stringBuilder.append(value.toString()+" ");
			}
		}
		return stringBuilder.toString();
	}

}
