package prog10_2;

import java.util.Objects;

public class Rational {
	private int p;
	private int q;

	public Rational(int p, int q){
		if (q < 0) {
			throw new IllegalArgumentException(" q should be positive");
		} 
		this.p = p;
		this.q = q;
	}

	public int getPValue() {
		return p;
	}

	public void setPValue(int pValue) {
		this.p = pValue;
	}

	public int getQValue() {
		return q;
	}

	public void setQValue(int qValue) {
		this.q = qValue;
	}

	public Rational add(Rational rational) {
		int valueOfP = rational.p;
		int valueOfQ = rational.q;
		Rational retObj = new Rational((p * valueOfQ) + (valueOfP * q), q * valueOfQ);
		return retObj;

	}

	public Rational multiply(Rational rational) {
		int valueOfP = rational.p;
		int valueOfQ = rational.q;
		Rational retObj = new Rational(p * valueOfP, q * valueOfQ);
		return retObj;
	}

	public int compareTo(Rational rat) {
		int valueOfP = rat.p;
		int valueOfQ = rat.q;
		if ((p * valueOfQ) < (q * valueOfP)) {
			return -1;
		}
			
		else if ((p * valueOfQ) > (q * valueOfP)) {
			return 1;
		}
			
		else {
			return 0;
		}
			
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
			
		if (getClass() != object.getClass()) {
			return false;
		}
			
		Rational ratObj = (Rational) object;
		return p * ratObj.q == q * ratObj.p;

	}

	public int hashCode() {
		return Objects.hash(p, q);
	}

	public String toString() {

		return String.format("%1s/%1s", p, q);
	}

	public static void main(String[] args) {

		Rational firstRatObj = new Rational(2, 3);
		Rational seconRatObj = new Rational(-17, 5);
		Rational thirdRatObj = new Rational(1, 3);
		
		Rational resultObj1 = firstRatObj.multiply(seconRatObj).add(thirdRatObj);
		Rational resultObj2 = seconRatObj.add(thirdRatObj).multiply(firstRatObj);
		if (resultObj1.compareTo(resultObj2) < 0) {
			System.out.println(firstRatObj + "*" + seconRatObj + "+" + thirdRatObj + " is less than " + firstRatObj + "*" + "(" + seconRatObj + "+" + thirdRatObj + ")");
		} else {
			System.out.println(firstRatObj + "*" + seconRatObj + "+" + thirdRatObj + " is greater than " + firstRatObj + "*" + "(" + seconRatObj + "+" + thirdRatObj + ")");
		}
	}
}
