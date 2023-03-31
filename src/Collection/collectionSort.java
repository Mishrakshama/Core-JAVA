package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class collectionSort {
public static void main(String[] args) {
	ArrayList<String> companies= new ArrayList<>();
	companies.add("infosys");
	companies.add("ibm");
	companies.add("google");
	Collections.sort(companies);
	System.out.println(companies);
}
}
