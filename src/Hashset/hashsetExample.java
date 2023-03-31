package Hashset;

import java.util.HashSet;
import java.util.Set;
public class hashsetExample {

	public static void main(String[] args) {
		Set<Integer> in= new HashSet<Integer>();
		Set<String> food = new HashSet<String>();
		
		in.add(1);
		in.add(2);
		in.add(1);
		in.add(2);
		food.add("Pasta"); 
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		System.out.print("Set output without the duplicates: ");
		System.out.println(in);
		System.out.println(food);
	}

}
