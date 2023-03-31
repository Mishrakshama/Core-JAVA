package AbstractClass;

abstract class Student {
private String studentName;
private int[] testScore;
private String testResult;
  

public Student(String studentName) {
	this.studentName = studentName;
	this.testScore= new int[4];
}

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int[] getTestScore() {
	return testScore;
}

public void setTestScore(int testNumber, int testScore) {
	this.testScore[testNumber]=testScore;
}

public String getTestResult() {
	return testResult;
}
public void setTestResult(String testResult) {
	this.testResult= testResult;
}

}
