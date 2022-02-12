package prog8_5;
public class MyTable {
	private Entry[] entries;
	private int sizeOfArr;
	public MyTable() {
		// TODO Auto-generated constructor stub
		entries=new Entry[26];
		sizeOfArr=0;
	}
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		for(Entry en:entries) {
			if(en.charecter==c) {
				return en.string;
			}
		}
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
		if(entries.length>sizeOfArr) {
			Entry newEntry=new Entry(s, c);
			entries[sizeOfArr++]=newEntry;
		}
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		String retString="";
		for(int index=0;index<sizeOfArr;index++) {
			Entry entry=entries[index];
			retString=retString+entry.toString();
			retString=retString+" ";
		}
		return retString;
	}
	
	
	private class Entry {
		private char charecter;
		private String string;
		Entry(String str, char ch){
			//implement
			this.charecter=ch;
			this.string=str;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			String retString=String.format("%s %s %s",charecter,"->",string);
			retString=retString+"\n";
			return retString;
		}
	}
	
	public static void main(String[] rags) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		String s = t.get('b');
		System.out.println(s);
		System.out.println(t);
	}

}