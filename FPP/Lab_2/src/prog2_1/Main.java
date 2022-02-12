package prog2_1;

public class Main {
	public static void main(String[] args) {
		Address add1A = new Address("10 Adams", "Chicago", "Illinois", "60411");
		Address add1B = new Address("110 Burlington", "Aurora", "Illinois", "60411");
		Address add2A = new Address("322 Harrison", "Joliet", "Illinois", "60411");
		Address add2B = new Address("2210 Burlington", "Elgin", "Illinois", "60411");
		
		Customer firstCustomer=new Customer("Faysal","Mazed","999-99-9999",add1A,add1B);
		Customer secondCustomer=new Customer("Anawar","Hossain","111-11-1111",add2A,add2B);

		
		Customer[] customerArrCustomer= {firstCustomer,secondCustomer};
		for(Customer cus:customerArrCustomer) {
			if(cus.billingAddress.getCity().equalsIgnoreCase("Chicago")) {
				System.out.println(cus.toString());
			}
		}
	}
}
