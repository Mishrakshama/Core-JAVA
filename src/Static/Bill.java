package Static;

class Bill {
private static int counter=9001;
private String billId="B";
private String paymentMode;
public static int getCounter() {
	return counter++;
}
public Bill(String paymentMode){
    this.paymentMode= paymentMode;
    }
public String getBillId() {
	return billId+getCounter();
}
public void setBillId(String billId) {
	this.billId = billId;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
}
