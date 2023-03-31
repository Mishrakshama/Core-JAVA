package Aggregationexersise;
public class AggregationExercise1 {
public static void main(String args[]) {
	Author author1= new Author("Joshua Bloch","josua@gmail.com",'M');
	Book book1= new Book("Effective Java",author1,45l,15);
	Book[] bk= {book1};
	for(int i=0;i<bk.length;i++) {
		bk[i].displayAuthorDetails();
	}
	
}
}
