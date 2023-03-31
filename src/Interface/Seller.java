package Interface;

public class Seller implements Tax {
	private String location;
	private double taxPercentage;
	 public Seller(String location) {
		 this.location= location;
	 }
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		if(this.location.equals("Middle east")) {
			this.taxPercentage=15;
		}
		else if(this.location.equals("Europe")) {
			this.taxPercentage=25;
		}
		if(this.location.equals("Canada")) {
			this.taxPercentage=22;
		}
		if(this.location.equals("Japan")) {
			this.taxPercentage=12;
		}
		return (price*this.taxPercentage/100);
	}
}
