package prog3_3;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		
		size = 0;
	}
	
	public void add(String s){
		//implement
		if(size==strArray.length) {
			resize();
		}
		strArray[size]=s;
		++size;
	}
	
	public String get(int i){
		//implement
		if(i<size) {
			return strArray[i];
		}
		return null;
	}
	
	public boolean find(String s){
		//implemement
		for(int i=0;i<size;++i) {
			if(s.equals(strArray[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(String s, int pos){
		//implement
		if(size>pos) {
			int i=0;
			for(i=size;i>pos;--i) {    //0 1 2 3 4 5 Size(6)
				strArray[i]=strArray[i-1];  //    * 
			}
			//--i;
			strArray[i]=s;
			++size;
		}else {
			add(s);
		}
		
		
	}
	
	public boolean remove(String s){
		//implement
		for(int pos=0;pos<size;++pos) {
			if(s.equals(strArray[pos])) {
				//System.out.println(pos);
				int k=0;
				for(k=pos;k<size-1;++k) {
					strArray[k]=strArray[k+1];
				}
				strArray[k]=null;
				--size;
				return true;
			}
		}
		return false;
	}
	
	
	private void resize(){
		//implement
		System.out.println("Resizing.....");
		String[] strTempArray=strArray;
		strArray = new String[strArray.length+2];
		System.arraycopy(strTempArray, 0, strArray, 0, strTempArray.length);
		
	}
	public String toString(){
		//implement
		StringBuilder str=new StringBuilder();
		str.append("[");
		for(int i=0;i<size;++i) {
			str.append(strArray[i]);
			if(i!=size-1) {
				str.append(",");
			}
		}
		str.append("]");
		return str.toString();
	}
	public int size() {
		
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);		
	}

}
