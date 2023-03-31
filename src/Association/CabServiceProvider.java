package Association;

public class CabServiceProvider {
private String cabServiceName;
private int totalCabs;
public CabServiceProvider(String cabServiceName, int totalCabs){
	this.cabServiceName= cabServiceName;
	this.totalCabs= totalCabs;
}
public String getCabServiceName() {
	return cabServiceName;
}
public void setCabServiceName(String cabServiceName) {
	this.cabServiceName = cabServiceName;
}
public int getTotalCabs() {
	return totalCabs;
}
public void setTotalCabs(int totalCabs) {
	this.totalCabs = totalCabs;
}
public double calculateRewardPrice(Driver driver) {
	float driverRating= driver.getAverageRating();
	double rewardPrice=0;
	if(this.cabServiceName.equals("Halo")) {
		if(driverRating >= 4.5 && driverRating<=5) {
			rewardPrice=10* driverRating;
		}
		else if(driverRating >= 4.0 && driverRating<=4.5) {
			rewardPrice=5* driverRating;
		}
	}
	else if(this.cabServiceName.equals("Aber")) {
		if(driverRating >= 4.5 && driverRating<=5) {
			rewardPrice=8* driverRating;
		}
		else if(driverRating >= 4.0 && driverRating<=4.5) {
			rewardPrice=3* driverRating;
		}
	}
	return Math.round(rewardPrice*100.0)/100.0;
}

}
