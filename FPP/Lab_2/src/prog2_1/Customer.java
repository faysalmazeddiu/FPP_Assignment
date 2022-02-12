package prog2_1;


public class Customer {
	String firstName;
	String lastName;
	String socSecurityNum;
	Address billingAddress;
	Address shippingAddress;
	
	public Customer() {
		
	}
	
	public Customer(String firstName,String lastName,String socSecurityNum,Address billingAddress,Address shippingAddress) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.socSecurityNum=socSecurityNum;
		this.billingAddress=billingAddress;
		this.shippingAddress=shippingAddress;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum=socSecurityNum;
	}
	
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress=billingAddress;
	}
	
	public Address getBillingAddress() {
		return billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String toString() {
		return "[Name : "+firstName+" "+lastName+", SSN : "+socSecurityNum+"]";
	}
}
