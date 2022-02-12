package CompairablePractice;

public class MyString implements Comparable<MyString>{
	
	String nameString;
	public MyString(String name) {
		// TODO Auto-generated constructor stub
		this.nameString=name;
	}

	@Override
	public int compareTo(MyString o) {
		// TODO Auto-generated method stub
		//System.out.println(this.nameString+"==="+o.nameString);
		if(this.nameString.length()<o.nameString.length()) {
			return 1;
		}
		if(this.nameString.length()>o.nameString.length()) {
			return -1;
		}
		return 0;
	}

}
