package array;

public class arrassignment1 {

private String teacherName;
private String subject;
private double salary;
public arrassignment1( String teacherName,String subject,double salary){
	this.teacherName=teacherName;
	this.subject= subject;
	this.salary= salary;
}

public String getTeacherName() {
	return teacherName;
}

public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public void displayDetails() {
	
	System.out.println("Name: "+this.teacherName+" Subject: "+this.subject+" Salary: "+this.salary);
}


//public void displayDetails() {
//	System.out.println("Name:");
//	for(int i = 0;i <this.teacherName.length;i++) {
//		System.out.println(teacherName[i]);
//	}
//	System.out.println("Sub:"+this.subject);
//	System.out.println("sal:"+this.salary);
//}
}
