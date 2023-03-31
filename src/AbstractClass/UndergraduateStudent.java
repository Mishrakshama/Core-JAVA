package AbstractClass;

public class UndergraduateStudent extends Student {
public UndergraduateStudent(String studentName) {
	super(studentName);	
}
public void generateResult() {
	int[] testScore= new int[4];
	int sum=0;
	int avg;
	testScore= getTestScore();
	for(int i=0; i<testScore.length;i++) {
		sum+=testScore[i];
	}
	avg= sum /testScore.length;
	if(avg>=60) {
		setTestResult("Pass");
	}
	else setTestResult("Fail");
}
}
