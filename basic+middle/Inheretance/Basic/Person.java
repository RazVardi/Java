package basic_inheretance;

public class Person { //task 1
	
	private String name;
	private String email;
	private long birthYear;
	
	public Person(String name, String email, long birthYear) {
		this.name = name;
		this.email = email;
		this.birthYear = birthYear;
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

	public long getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(long birthYear) {
		this.birthYear = birthYear;
	}

	
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
}
