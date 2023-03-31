package Final;

public class Student {
final private int STIPEND=100;
private int studentId;
private int aggregateMarks;
public double calculateTotalStipend() {
    
	if(this.getAggregateMarks()>=85 &&this.getAggregateMarks()<90) {
		return this.getSTIPEND()+10;
	}
	else if(this.getAggregateMarks()>=90 &&this.getAggregateMarks()<95) {
		return this.getSTIPEND()+15;
	}
	else if(this.getAggregateMarks()>=95 &&this.getAggregateMarks()<=100) {
		 return this.getSTIPEND()+20;
	}
	else
		return this.getSTIPEND();
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getAggregateMarks() {
	return aggregateMarks;
}
public void setAggregateMarks(int aggregateMarks) {
	this.aggregateMarks = aggregateMarks;
}
public int getSTIPEND() {
	return STIPEND;
}

}
