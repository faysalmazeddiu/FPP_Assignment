package prog5_1;

/*
	 Answer :
	
	(1) when instance of MySingleton class is created once , after that no other instance of MySingleton should be created.
	    for doing that, we have to check the reference of MySingleton class. if the reference of MySingleton class is null, 
	    only that time instance of MySingleton class will be allowed to create.
	    
	     in singleton class, constructor is declared as private . as a result, user will not be able to invoke constructor, 
	     as default constructor is invoked at the time of object creation.so, users are not allowed to create directly any 
	     object of singleton class. 
	 
	 (2) since, in singleton class constructor is declared as private. To make the singleton class accessible to user , 
	     a static method need to be implemented, which actually returns the first object of singleton class. 
	     
	 (3) the rules of singleton class is object of singleton class will be created once. so, to check the number of 
	     object creation of singleton class, we can initialize a static variable. whenever object of singleton class will be 
	     created, static variable will be incremented by 1. for singleton class , the value of static variable will be 
	     incremented only one time.
*/

public class MySingleton {
	public static int count=0;
	private static MySingleton singletonInstance;
	private MySingleton() {
		++count;
	}
	public static MySingleton createInstace() {
		if(singletonInstance==null) {
			singletonInstance=new MySingleton();
		}
		return singletonInstance;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			MySingleton.createInstace();
		}
		System.out.println(MySingleton.count);
		
	}
}


