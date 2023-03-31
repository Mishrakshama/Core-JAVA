package complete_java;
//the variables of a particular class are hidden from other classes.
//We can access these variables only through the methods of the class. 
//Hence, it is also referred as data hiding.
 class kuchbhi{
	public String name;
	public int id;
	public long contactNumber;
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Id: " +id);
		System.out.println("Contact number: "+contactNumber);
	System.out.println();
	}
}
public class Encapsulation {
	public static void main(String[] args) {
	kuchbhi c= new kuchbhi();
	c.name = "Ram";
	c.id = 1234;
	c.contactNumber =1234567890l;
	c.displayDetails();
	
	}
}
