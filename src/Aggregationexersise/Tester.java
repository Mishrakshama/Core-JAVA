package Aggregationexersise;

public class Tester {

	public static void main(String[] args) {
address a1= new address("100s","aaa","bbb",123);
address a2= new address("100s","ddd ","ccc",123);
customer c1= new customer("101o","xyz",123456l,a1);
customer c2= new customer("102o","abc",98765l,a2);
customer[] cust= {c1,c2};
for(int i=0; i<cust.length; i++) {
	System.out.println("Displaying custmer"+(i+1)+" Details: ");
	cust[i].displayCustomerDetails();
	System.out.println();
}
	}

}
