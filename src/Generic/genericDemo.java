package Generic;

public class genericDemo {
public static <E> void display(E[]arr) {
	for(E element:arr) {
		System.out.println(element);
	}
}
	public static void main(String args[]) {
		String[] name= {"h","b","sds"};
		display(name);
		System.out.println();
		
		
		Integer[] num= {1,2,3,4,5};
		display(num);
	}

}
