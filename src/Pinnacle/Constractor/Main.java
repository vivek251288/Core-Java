package Pinnacle.Constractor;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello Vivek ");
		System.out.println("Welcome to Core Java");
		Student st1;
		st1 = new Student();
		st1.studentId =234;
		st1.studentName ="Ram";
		st1.studentAddress = "delhi";
		st1.study();
		st1.showFulldetails();
		
	//	Student st2;
		Student st2 = new Student(345, "SYAM", "New Delhi");
		
//		st2.studentId=345;
//		st2.studentName ="Laxman";
//		st2.studentAddress = "New Delhi";
		
		st2.study();
		st2.showFulldetails();
		
		
	}

}
