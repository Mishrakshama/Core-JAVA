package Static;

public class tester {
	  public static void main(String[] args) {

	    
	       
	        Bill bill3 = new Bill("CraditCard");
	        Bill bill1 = new Bill("DebitCard");
	        Bill bill4 = new Bill("CreditCard");
	        Bill bill2 = new Bill("PayPal");
	        Bill bill5 = new Bill("GooglePay");
	        
	        //Create more objects and add them to the bills array for testing your code
	              
	        Bill[] bills = { bill1, bill2};
	              
	        for (Bill bill : bills) {
	            System.out.println("Bill Details");
	            System.out.println("Bill Id: " + bill.getBillId());
	            System.out.println("Payment method: " + bill.getPaymentMode());
	            System.out.println();
	       }
		  
		  
		  
		  //static-2
		  
//			Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
//			Participant participant2 = new Participant("Merina", 7890423112L, "New York");
//			
//			//Create more objects and add them to the participants array for testing your code
//			
//			Participant[] participants = { participant1, participant2 };
//			
//			for (Participant participant : participants) {
//				System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
//			}
			
		  
//		  static-3
//		   Booking booking1 = new Booking("jack@email.com", 100);
//	        Booking booking2 = new Booking("jill@email.com", 350);
//
//	        //Create more objects and add them to the bookings array for testing your code
//	        
//	        Booking[] bookings = { booking1, booking2 };
//	              
//	        for (Booking booking : bookings) {
//	            if (booking.isBooked()) {
//	                System.out.println(booking.getSeatRequired()+" seats successfully booked for "+booking.getCustomerEmail());
//	            }
//	            else {
//	                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
//	                System.out.println("Seats available: "+Booking.getSeatAvailable());
//	            }
//	         }
//	    
//			
    }

		  
}
