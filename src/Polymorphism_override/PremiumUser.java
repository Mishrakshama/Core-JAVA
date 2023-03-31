package Polymorphism_override;

class PremiumUser extends User {
private int rewardPoints;
public PremiumUser(int id, String userName, String emailId, double walletBalance) {
	super(id,userName,emailId,walletBalance);
}

public int getRewardPoints() {
	return rewardPoints;
}

public void setRewardPoints(int rewardPoints) {
	this.rewardPoints = rewardPoints;
}

@Override

public boolean makePayment(double billAmount) {
	if(getWalletBalance()>=billAmount) {
		setRewardPoints(getRewardPoints()+(int)(billAmount*0.1));
	}
	return super.makePayment(billAmount);

}

}
