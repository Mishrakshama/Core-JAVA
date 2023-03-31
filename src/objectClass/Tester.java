package objectClass;

public class Tester {

	public static void main(String[] args) {
		Food foodOne = new Food();
		foodOne.setFoodName("Sandwich");
		foodOne.setCuisine("Continental");
		foodOne.setFoodType("Veg");
		foodOne.setQuantityAvailable(100);
		foodOne.setUnitPrice(10);

		Food foodTwo = new Food();
		foodTwo.setFoodName("Sandwich");
		foodTwo.setCuisine("Continental");
		foodTwo.setFoodType("Veg");
		foodTwo.setQuantityAvailable(200);
		foodTwo.setUnitPrice(10);

		if (foodOne == foodTwo) {
			System.out.println("The food objects are same!");
		} else {
			System.out.println("The food objects are different!");
		}
		
		Food foodThree = new Food();
		foodThree.setFoodName("Burger");
		foodThree.setCuisine("Continental");
		foodThree.setFoodType("Veg");
		foodThree.setQuantityAvailable(100);
		foodThree.setUnitPrice(10);
		if (foodOne.equals(foodThree)) {
			System.out.println("foodOne and foodThree are same!");
		} else {
			System.out.println("foodOne and foodThree are different!");
		}
		System.out.println("Hash code for foodOne : " + foodOne.hashCode());
		System.out.println("Hash code for foodThree : " + foodThree.hashCode());
		
		if (foodOne.equals(foodTwo)) {
			System.out.println("foodOne and foodTwo are same!");
		} else {
			System.out.println("foodOne and foodTwo are different!");
		}
		System.out.println("Hash code for foodOne : " + foodOne.hashCode());
		System.out.println("Hash code for foodTwo : " + foodTwo.hashCode());
		
		//toString() in the Food class 
		System.out.println(foodOne);
		System.out.println(foodTwo);
	}
	}

	
