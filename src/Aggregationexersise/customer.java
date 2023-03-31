package Aggregationexersise;

public class customer {
private String customerId;
private String customerName;
private long contactNumber;
private address address;
public customer(String customerId, String customerName,long contactNumber,address address) {
	this.customerId=customerId;
	this.customerName= customerName;
	this.contactNumber= contactNumber;
	this.address=address;
}
public customer(String customerId, String customerName,long contactNumber) {
	this.customerId=customerId;
	this.customerName= customerName;
	this.contactNumber= contactNumber;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public address getAddress() {
	return address;
}
public void setAddress(address address) {
	this.address = address;
}
public void displayCustomerDetails() {
	System.out.println("customerId: "+getCustomerId());
	System.out.println("CustomerName: " +getCustomerName());
	System.out.println("ContactNumber:"+ getContactNumber());
	//System.out.println(" doorNo: "+getAddress().getDoorNo());
	getAddress().displayAddress();
}
}
