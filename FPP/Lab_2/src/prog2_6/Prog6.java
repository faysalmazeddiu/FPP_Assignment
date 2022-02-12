package prog2_6;



public class Prog6 {
	
	
	static String[] removeDups(String[] arr) {
		String[] tempStrArr=new String[arr.length];
		int index=0;
		for(String val:arr) {
			boolean isDuplicate=false;
			for(String val2:tempStrArr) {
				if(val==val2) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				tempStrArr[index]=val;
				++index;
			}
		}
		String[] returnArr=new String[index];
		for(int i=0;i<returnArr.length;++i) {
			returnArr[i]=tempStrArr[i];
		}
		return returnArr;
	}

}
