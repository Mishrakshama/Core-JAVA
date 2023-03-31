package complete_java;
/* Find and return the average salary, number of salaries greater than the average salary and number of salaries lesser than the average salary from the salary array passed to the findDetails() method. Return a double array containing average salary in index position 0, number of salaries greater than the average salary in index position 1 and number of salaries lesser than the average salary in index position 2. Implement the logic inside findDetails() method.

Test the functionalities using the main method of the Tester class.

 

Sample Input and Output

*/
public class Arr_exe_2 {
    public static double[] findDetails(double[] salary) { 
double details[]=new double[3];
double avg=0,greater=0,less=0;
for(int i=0;i<salary.length;i++) {
	avg= avg+ salary[i];
}
avg= avg /salary.length;
for(int i=0;i<salary.length;i++) {
	if(salary[i]>avg) {
		greater++;
	}
	else {
		less++;
	}
	
}
details[0]=avg;
details[1]=greater;
details[2]=less;
return details;
    }
    
	public static void main (String[] args)
	{double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
    double[] details = findDetails(salary);
          
    System.out.println("Average salary: "+ details[0]);
    System.out.println("Number of salaries greater than the average salary: "+ details[1]);
    System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
}
}
