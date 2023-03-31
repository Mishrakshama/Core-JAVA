package Inheritance;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;
   public PermanentEmployee(int employeeId,String name,double basicPay,double hra,float experience) {
	   super(employeeId,name);
	   this.basicPay= basicPay;
	   this.hra=hra;
	   this.experience=experience;
   }
   public void calculateMonthlySalary() {
	   double x=0,var;
	   if(getExperience()<3f)x=0;
	   else if(getExperience()>=3 && getExperience()<5) {
		   x=5;
	   }
	   else if(getExperience()>=5&&getExperience()<10) {
		   x=7;
	   }
	   else if(getExperience()>=10) {
		   x=12;
	   } 
	   var= getBasicPay()*(x/100);
	 setSalary((float)(var+getBasicPay()+getHra()));
   }
public double getBasicPay() {
	return basicPay;
}
public void setBasicPay(double basicPay) {
	this.basicPay = basicPay;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public float getExperience() {
	return experience;
}
public void setExperience(float experience) {
	this.experience = experience;
}
   
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
   
}

