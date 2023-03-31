package AbstractClass;

public class GraduateStudent extends Student{
public GraduateStudent(String studentName) {
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
	if(avg>=70) {
		setTestResult("Pass");
	}
	else setTestResult("Fail");
}

}
