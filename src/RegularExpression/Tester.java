package RegularExpression;

public class Tester {

	public static void main(String[] args) {
		String regex1 = "Welcome.*";
		String str1 = "Welcome to India";

		String regex2 = "Welcome to (India|Mysore)";
		String str2 = "Welcome to Mysore";

		String regex3 = "[^Welcome]";
		String str3 = "1";

		System.out.println(str1.matches(regex1));
		System.out.println(str2.matches(regex2));
		System.out.println(str3.matches(regex3));

		String regex4 = "[\\w]+ [\\w]+ [\\d]+";
		String str4 = "Java Training 123";

		String regex5 = "[\\w]+ [\\t] [\\w]+";
		String str5 = "Java 	 Training";

		String regex6 = "[\\w]+ [^\\w]+ [\\d]+";
		String str6 = "Java Training 123";

		String regex7 = "[\\D]+ [\\W]+";
		String str7 = "Java *";

		System.out.println(str4.matches(regex4));
		System.out.println(str5.matches(regex5));
		System.out.println(str6.matches(regex6));
		System.out.println(str7.matches(regex7));
	}

}
