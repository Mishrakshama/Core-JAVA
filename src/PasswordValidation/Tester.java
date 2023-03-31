package PasswordValidation;
class Tester{
public static boolean checkNameValidity(String name) {
    //Implement your code here and change the return value accordingly
	String regex = "^[A-Z](?=.{1,29}$)[A-Za-z]*(?:\\h+[A-Z][A-Za-z]*)*$";
	if(name.matches(regex)) {
		return true;
	}
	else
    return false;
}

public static void main(String[] args) {
    
    //Change the value of name for testing your code with different names
    String name = "Roger federer";
    System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
}
}
