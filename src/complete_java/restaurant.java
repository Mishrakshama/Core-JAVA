package complete_java;
	public class restaurant {
		private String RestaurantName;
		private long[] restaurantContacts;
		private String restaurantAddress;
		private float Rating;
		public restaurant(String name, long[] contacts, String Address, float rating) {
			this.RestaurantName = name;
			this.restaurantContacts = contacts;
			this.restaurantAddress = Address;
			this.Rating = rating;
		}
		public void DisplayRestaurantDetails() {
			System.out.println("Restaurant Details \n***************");
			System.out.println("Restaurant Name : " + this.RestaurantName);
			System.out.println("Restaurant Rating : " + this.Rating);
			for (int index = 0; index < this.restaurantContacts.length; index++) {
				System.out.println("Restaurant Contacts : "
						+ this.restaurantContacts[index]);
			}
			System.out.println("Restaurant Address : " + this.restaurantAddress);
			System.out.println();
		}
		public String GetRestaurantName() {
			return RestaurantName;
		}
		public void setRestaurantName(String RestaurantName) {
			this.RestaurantName = RestaurantName;
		}
		public long[] getRestaurantContacts() {
			return restaurantContacts;
		}
		public void setRestaurantContacts(long[] RestaurantContacts) {
			this.restaurantContacts = RestaurantContacts;
		}
		public String getRestaurantAddress() {
			return restaurantAddress;
		}
		public void setRestaurantAddress(String restaurantAddress) {
			this.restaurantAddress = restaurantAddress;
		}
		public float getRating() {
			return Rating;
		}
		public void setRating(float rating) {
			this.Rating = rating;
		}
	}
	

