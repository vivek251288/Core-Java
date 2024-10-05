package Pinnacle.Constractor;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	
///parameteries constructor
public Student() {
	System.out.println("creating object : non p");
		
	}
public Student(int st){ 
	System.out.println("parameterized constructor");
	 }
	
//parameteries constructor 
public Student(int i, String n ,String c){ 
		studentId =i;
		studentName =n;
		studentAddress =c;
	}
	
public void study() {
	
		System.out.println(studentName + " is studying ");
	}
public void study(float f) {
	
}
              	
public void showFulldetails() {
	System.out.println("my name is " + studentName);
	System.out.println("my id is " + studentId);
	System.out.println("my city is " + studentAddress);
	}
}
