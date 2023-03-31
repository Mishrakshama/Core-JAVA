package Collection;
import java.util.ArrayList;
import java.util.Collections;
class Course implements Comparable<Course> {
	private int courseId;
	private String courseName;

	public Course(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	@Override
	public int compareTo(Course otherCourse) {
		return this.courseName.compareTo(otherCourse.courseName);
	}

	@Override
	public String toString() {
		return this.courseId + ":" + this.courseName;
	}

	public static void main(String[] args) {
		ArrayList<Course> courseList = new ArrayList<>();
		courseList.add(new Course(124, "AngularJS"));
		courseList.add(new Course(120, "Java"));
		courseList.add(new Course(121, "Hibernate"));

		Collections.sort(courseList);
		System.out.println(courseList);

	}

}

