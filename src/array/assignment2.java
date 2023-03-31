package array;

public class assignment2 {
	public static double[] findDetails(double[] salary) {
		double[] details = new double[3];
		double avg = 0, greater = 0, less = 0;
		for (int i = 0; i < salary.length; i++) {
			avg += salary[i];
		}
		avg= avg/salary.length;
			for (int i = 0; i < salary.length; i++) {
			if (avg<salary[i]) {
				greater++;
			} else if(avg>salary[i]) {
				less++;
			}
			details[0] = avg;
			details[1] = greater;
			details[2] = less;
		}
		return details;
	}

	public static void main(String[] args) {
		double[] salary = { 23500.0, 23500.0,23500.0,23500.0 };
		double[] details = findDetails(salary);

		System.out.println("Average salary: " + details[0]);
		System.out.println("Number of salaries greater than the average salary: " + details[1]);
		System.out.println("Number of salaries lesser than the average salary: " + details[2]);
	}
}
