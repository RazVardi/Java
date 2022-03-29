package new_classes_advance;

public class App { //task1

	public static void main(String[] args) {//task 1
		//part 1 page 2
		Student [] newstudents=new Student[5];
		 newstudents[0] = new Student("eylon","eylon@gmail.com",
				"0549876543","rehovot",35,new double []{85.0,88.0,95.0});
		 newstudents[1] = new Student("victor","victor@gmail.com",
				"0543456789","Ramat gan",30,new double []{87.0,89.0,93.0});
		 newstudents[2] = new Student("tal","tal@gmail.com",
				"0541234567","T\"A",25,new double []{98.0,91.0,92.0});
		 newstudents[3] = new Student("udi","udi@gmail.com",
				"0547654321","Natania",40,new double []{84.0,96.0,97.0});
		 newstudents[4] = new Student("boaz","eylon@gmail.com",
				"0541234789","Raanana",35,new double []{86.0,90.0,94.0});
		//part 2 page 2
		printStudentDetails(newstudents);
		//part 3+4 page 2
		printGradesStudent(newstudents);
	}
	
	//part 2 page 2
	private static void printStudentDetails(Student [] newstudents) {
		for (int i = 0; i < newstudents.length; i++) {
			System.out.println(newstudents[i].getName()+ " is the: " + newstudents[i].toString());
		}
	}
	
	//part 3+4 page 2
	private static void printGradesStudent(Student [] newstudents) {
		//part 4 page 2
		double sum = 0,average;
		//part 3 page 2
		for (int i = 0; i < newstudents.length; i++) {
			System.out.println("the grades of " + newstudents[i].getName() +
					" is: " + newstudents[i].getAverageGrades() );
			//part 4 page 2 
			sum=sum+newstudents[i].getAverageGrades();
		}
		//part 4 page 2 
		average=sum/newstudents.length;
		System.out.println("the average grades of all the student "
				+ "is: " + average);
    }
}
