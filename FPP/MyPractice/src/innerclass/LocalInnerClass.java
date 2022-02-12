package innerclass;

import java.util.Arrays;
import java.util.Comparator;

public class LocalInnerClass {

	public LocalInnerClass() {
		myMethod();
	}

	public void myMethod() {

		class People {
			String nameString;
			int ageString;

			People() {
			}

			People(String name, int age) {
				this.ageString = age;
				this.nameString = name;

			}

			public People[] createPeopleObj() {
				People[] peoples = { new People("Mazed", 15), new People("Himel", 10), new People("Helal", 20),
						new People("Himel", 8) };
				return peoples;
			}

			public void sortAndPrint(People[] p) {
				Arrays.sort(p, new Comparator<People>() {
					@Override
					public int compare(People o1, People o2) {
						if (o1.ageString < o2.ageString) {
							return 1;
						}
						if (o1.ageString > o2.ageString) {
							return -1;
						}
						if (o1.ageString == o2.ageString) {
							return 0;
						}
						return -1;
					}
				});
				for (People pval : p) {
					System.out.println(pval.nameString + " " + pval.ageString);
				}
			}

			
		}
		People people = new People();
		people.sortAndPrint(people.createPeopleObj());
	}

	public static void main(String[] args) {
		LocalInnerClass localInnerObjClass = new LocalInnerClass();
		// localInnerObjClass.myMethod();

	}

	/*
	 * 
	 * public void myMethod() {
	 * 
	 * class People implements Comparator<People>{ String nameString; int ageString;
	 * People(){ // People[] peoples=createPeopleObj(); // sortAndPrint(peoples); }
	 * People(String name, int age){ this.ageString=age; this.nameString=name;
	 * 
	 * } public People[] createPeopleObj() { People[] peoples= { new People("Mazed",
	 * 15), new People("Himel", 10), new People("Helal", 20), new People("Himel", 8)
	 * }; return peoples; }
	 * 
	 * public void sortAndPrint(People[] p) { Arrays.sort(p,new People());
	 * for(People pval:p) { System.out.println(pval.nameString+" "+pval.ageString);
	 * } }
	 * 
	 * @Override public int compare(People o1, People o2) {
	 * if(o1.ageString<o2.ageString) { return 1; } if(o1.ageString>o2.ageString) {
	 * return -1; } if(o1.ageString==o2.ageString) { return 0; } return -1; } }
	 * People people=new People(); people.sortAndPrint(people.createPeopleObj()); }
	 */

	/*
	 * public LocalInnerClass() {
	 * 
	 * People[] people2= {
	 * 
	 * new People("Mazed", 15), new People("Himel", 10), new People("Helal", 20),
	 * new People("Himel", 8) }; myMethod(people2);
	 * 
	 * 
	 * } public void myMethod(People[] p) { Arrays.sort(p,new People()); for(People
	 * val:p) { System.out.println(val.nameString+" "+val.ageString); } }
	 * 
	 * 
	 * class People implements Comparator<People>{ String nameString; int ageString;
	 * People(){
	 * 
	 * } People(String name, int age){ this.ageString=age; this.nameString=name; }
	 * 
	 * @Override public int compare(People o1, People o2) {
	 * if(o1.ageString>o2.ageString) { return 1; } if(o1.ageString<o2.ageString) {
	 * return -1; } if(o1.ageString==o2.ageString) { return 0; } return -1; } }
	 */

}
