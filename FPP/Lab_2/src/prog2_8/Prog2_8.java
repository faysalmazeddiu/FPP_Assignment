package prog2_8;

public class Prog2_8 {
	static int min(int[] arrayOfInts) {
		int minValue=0;
		for(int i=0;i<arrayOfInts.length;++i) {
			if(i==0) {
				minValue=arrayOfInts[i];
			}else {
				if(minValue>arrayOfInts[i]) {
					minValue=arrayOfInts[i];
				}
			}
		}
		return minValue;
	}

}
