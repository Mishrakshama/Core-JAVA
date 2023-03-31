
public class WrapperClass {
	public static void main(String[] args) {

		int i = 4;
		Integer j= new Integer(4); // boxing
		Integer k=i;  //autoboxing
		
		
		
		
		// Comparison of Integer objects
		Integer x = 5;
		Integer y = new Integer(5); // int data converted to Integer object
		System.out.println("x == y: " + (x == y));
		System.out.println("x.equals(y): " + x.equals(y));

		// Wrap the primitive content into wrapper class objects
		Integer number = Integer.valueOf(x);
		System.out.println("Wrapping x to its Integer: " + number);
		System.out.println("Check if number is of type Integer: "
				+ (number instanceof Integer));

		// Wrappers can be used to convert numeric strings to numeric datatypes
		String numStr = "123";
		int numInt = Integer.parseInt(numStr);
		System.out.println("String to integer: " + numInt);

		String doubleStr = "123.45";
		double numDouble = Double.parseDouble(doubleStr);
		System.out.println("String to double: " + numDouble);

		// Type casting cannot be used to convert any wrapper type to another,
		// it will give compilation error
		/* Uncomment the below code and observe the output*/
		// Long phoneNoLong = (Long) new Integer(44281234); 

		// We can make use of methods like intValue(), byteValue(),
		// floatValue(), etc. for conversion
		Integer phoneNo = 44281234;
		// longValue() converts the Integer value to long data type
		Long phoneNoLong = phoneNo.longValue(); 
		System.out.println("Integer to Long: " + phoneNoLong);

		// Converts the Integer object to binary value
		System.out.println("Integer 5 as binary string: "
				+ Integer.toBinaryString(5));
	}

}
