package basic_inheretance;

public class EntryPoint { //task 1

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		students[0] = new Student("dima", "diam@gmail.com", 1989, "electronic", true);
		students[1] = new Student("valery", "valery@gmail.com", 1991, "electrical power", false);
		students[2] = new Student("eli", "eli@gmail.com", 1990, "python+automation", true);
		
		printInfo(students);
	}

	private static void printInfo(Student[] students) {
			for (int i = 0; i < students.length; i++) {
				System.out.println(students[i].toString());
		}
	}

}
