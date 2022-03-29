package new_classes_advance;

import java.util.Arrays;

public class Student { //task1
	
	//part 1 page 1
	private String name;
	//part 2 page 1
	private String email;
	//part 3 page 1
	private String phone;
	String city;
	private int age;
	//part 4 page 1
	
	double[]grades;
	
	public Student(String name, String email, String phone, String city, int age, double [] grades) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.age = age;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double [] getGrades() {
		return grades;
	}

	public void setGradesNew(double [] grades) {
		this.grades = grades;
	}
	
	
	//part 2 page 2
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city + ", age=" + age
				+ ", grades=" + Arrays.toString(grades) + "]";
	}
	
	//part 3 page 2
		public double getAverageGrades() {
			
			double sum = 0;
			for (int i = 0; i < grades.length; i++) {
				sum = sum + grades[i];
			}
			double average = sum/grades.length;
			
			return average;
		}


	
	
	
	
	
	
	
}
