package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("STUDENT MANAGEMENT SYSTEM OF MGM'S COLLEGE NANDED");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//Ask How Many Students we want to Add
		System.out.println("Enter number of new student to enroll :");
		Scanner in=new Scanner(System.in);
		int numOfStudents = in.nextInt();     
		Student[] s = new Student[numOfStudents]; //here we take array for enter students
		
		//Create n number of new students
		for(int n=0;n < numOfStudents; n++)
		{
			s[n]  = new Student();//it is like a[i]=new class name;
			s[n].enroll();
			s[n].payTution(n);
			
		}
		for(int n=0;n < numOfStudents; n++)
		{
		System.out.println(s[n].toString());
		

		
	}



	}

}
