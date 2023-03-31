package complete_java;
class Teacher{
	private String teacherName;
	private String subject;
	private double salary;
	public void setTeacherName(String teacherName) {
		this.teacherName= teacherName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setSubject(String subject) {
		this.subject= subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSalary(double salary) {
		this.salary= salary;
	}
	public double getSalary() {
		return salary;
	}
public Teacher(String teacherName,String subject,double salary ) {
	this.teacherName=teacherName;
	this.subject=subject;
	this.salary=salary;
	
}
public void displayDetail(){
	System.out.println("Name:"+getTeacherName()+ " Subject:"+getSubject()+" Salary:"+getSalary());
}
}

public class Array_ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher object[] = new Teacher[4];
		object[0]=new Teacher("Alex","Java Fundamental",1200l);
		object[1]=new Teacher("John","RDBMS",800l);
		object[2]=new Teacher("Sam","Networking",900l);
		object[3]=new Teacher("Maria","Python",900l);
		object[0].displayDetail();
		object[1].displayDetail();
		object[2].displayDetail();
		object[3].displayDetail();
	}

}
