package Inheritance;

public class ContractEmployee extends Employee {
    private double wage;
    private float hoursWorked;
    public ContractEmployee(int employeeId,String name,double wage, float hoursWorked) {
	super(employeeId,name);
	this.wage= wage;
	this.hoursWorked= hoursWorked;
}
   public void calculateSalary() {
	   setSalary(getHoursWorked()*getWage());
   }
public double getWage() {
	return wage;
}
public void setWage(double wage) {
	this.wage = wage;
}
public float getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(float hoursWorked) {
	this.hoursWorked = hoursWorked;
}
   
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
 
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
   
}