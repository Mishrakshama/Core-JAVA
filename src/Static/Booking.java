package Static;
public class Booking {
private String customerEmail;
private int seatRequired;
private boolean isBooked;
private static int seatAvailable;
static {
	seatAvailable=400;
}
public Booking(String customerEmail, int seatRequired) {
	this.customerEmail=customerEmail;
	this.seatRequired= seatRequired;
	if(seatRequired<=seatAvailable){
		isBooked=true;
		seatAvailable= seatAvailable-seatRequired;
	}
	else {
		isBooked= false;
	}
	
}

public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public int getSeatRequired() {
	return seatRequired;
}
public void setSeatRequired(int seatRequired) {
	this.seatRequired = seatRequired;
}
public boolean isBooked() {
	return isBooked;
}
public void setBooked(boolean isBooked) {
	this.isBooked = isBooked;
}
public static int getSeatAvailable() {
	return seatAvailable;
}
public static void setSeatAvailable(int seatAvailable) {
	Booking.seatAvailable = seatAvailable;
}
	
}
