package complete_java;
class km{
	private	String employeeId;
	private	String employeeName;
	private	int salary;
	private	int bonus;
	private	int jobLevel;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}
public class Encapsulation_example {

	public static void main(String[] args) {
		Employee employee = new Employee();
	    employee.setemployeeId("C101");
	    employee.setemployeeName("Steve");
	    employee.setsalary(650);
	    employee.setjobLevel(4);
		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getemployeeId());
		System.out.println("Employee Name: " + employee.getemployeeName());
		System.out.println("Salary: " + employee.getsalary());

	}

}
