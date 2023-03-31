package Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
		    permanentEmployee.calculateMonthlySalary();
		    System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
		            
		    ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
		    contractEmployee.calculateSalary();
		    System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
		        
		    //Create more objects for testing your code
	}

}
