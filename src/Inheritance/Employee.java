package Inheritance;
public class Employee {
    
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
	private int employeeId;
	private String employeeName;
	private double salary;
  public Employee(int employeeId, String employeeName) {
	  this.employeeId= employeeId;
	  this.employeeName=employeeName;
  }
    public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }

}

