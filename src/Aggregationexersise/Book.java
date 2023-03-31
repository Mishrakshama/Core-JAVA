package Aggregationexersise;

public class Book {
private String name;
private Author author ;
private double price;
private int quantity;
public Book(String name,Author author,double price,int quantity) {
	this.name= name;
	this.author=author;
	this.price=price;
	this.quantity=quantity;
}
public Book(String name,double price,int quantity) {
	this.name= name;
	this.price=price;
	this.quantity=quantity;
}
public void displayAuthorDetails() {
	System.out.println("Displaying author details");
	System.out.println("Author name: "+author.getName());
	System.out.println("Author email: "+author.getEmailId());
	System.out.println("Author gender: "+author.getGender());
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
