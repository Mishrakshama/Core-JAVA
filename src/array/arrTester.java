package array;

public class arrTester {

	public static void main(String[] args) {
	//arrassignment1 t2, arrassignment1 t1, arrassignment1 t3) {
	
//	String[] sub={"alex","alex","alex","alex"};
//	double[] salary= {1.0,2.0,3.0,4.0};
	//	arrassignment1 t1= new arrassignment1(String[] teacherName,String[] sub,double[] salary);
		
		arrassignment1 tt1= new arrassignment1("Alex","Java Fundamentals",1200l);
		arrassignment1 tt2= new arrassignment1("Alex","Java Fundamentals",1200l);
		arrassignment1 tt3= new arrassignment1("Alex","Java Fundamentals",1200l);
		arrassignment1[] t= {tt1,tt2,tt3};
		for(int i= 0; i< t.length; i++) {
			t[i].displayDetails();
		}
//	tt1.displayDetails();
//	tt2.displayDetails();
//	tt3.displayDetails();
	}

	}
