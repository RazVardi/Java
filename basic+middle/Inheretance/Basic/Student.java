package basic_inheretance;

public class Student extends Person { //task 1
	
	private String courseName;
	private boolean active;

	public Student(String name, String email, long birthYear,String courseName,boolean active) {
		super(name, email, birthYear);
		this.courseName = courseName;
		this.active = active;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Student [courseName=" + courseName + ", active=" + active + ", toString()=" + super.toString() + "]";
	}

}
