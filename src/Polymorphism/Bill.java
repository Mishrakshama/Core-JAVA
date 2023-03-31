package Polymorphism;

public class Bill {
	public double findPrice(int itemId) {
		switch(itemId) {
		case 1001:
			return 25;
		case 1002:
			return 20;
		case 1003:
			return 23;
		case 1004: 
			return 18;
		default:
				return 0;
		}
		
	}
	public double findPrice(String brandName, String itemType, int size) {
	if(brandName=="Puma") {
		if(itemType=="T-shirt" && (size==34||size==36)) {
			return 25;
		}
		else if(itemType=="Skirt" && (size==38||size==40)) {
			return 20;
		}
	}
		
	else if(brandName=="Reebok") {
		if(itemType=="T-shirt" && (size==34||size==36) ){
			return 23;
		}
		else if(itemType=="Skirt" && (size==38||size==40)) {
			return 18;
		}
	}
		return 0;
	
	}
	
}
