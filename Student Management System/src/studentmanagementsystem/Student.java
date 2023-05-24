package studentmanagementsystem;
import java.util.*;

public class Student {   //create class to pass data
	 String firstName1;
	String lastName;
     int courseCode;
	int studentID;
    String courses="";
	int tutionBalance=0;
	int costOfCourse =1500;
	
	private static int id=10000;
	
	
	public Student()          //create a constructor to pass the values
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter student first name:");
		this.firstName1=in.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName=in.nextLine();
		
		System.out.println("\n Enter in which course you want take admission: - \n 1.-BCA.\n 2.-BCS\n 3.-MCA \n 4.-MSC \n 5.-MBA:");
		this.courseCode=in.nextInt();
		
		
		setStudentID();
		

}
	private void setStudentID()   //create method for set the Id
	{
		// id++;

		//this.studentID = count++; //courseCode +""+id;
		this.studentID=id++;
	}
	
	
		public void enroll() {   //This Method is Use for enroll the courses which you want to take
		
		do{
		System.out.print("Enter Enrolled Course for tution:( press Q to Quit)"); 
		Scanner in=new Scanner(System.in);
		

		String course = in.nextLine();
	 
		if(!course.equalsIgnoreCase("Q"))         //for Ignore the case Sensitiveness Type Like Small or Capital
		{
			courses = courses+ " ,"+course;
			tutionBalance=tutionBalance +costOfCourse;
			
		}
		
		else {                                 
			//System.out.println("BREAK");
			
			break;
			}
		} 
		while(1 != 0);  
		//System.out.println("Enroll In:"+courses);
	
				
	}
		//View Balance
	
		public void viewBalance()     // print the Balance Statement if we pay the Extra Money

	{
		System.out.println("Your  BalanceFees  Is : " +tutionBalance);
	}
	
	//Pay Tuition Fee
		public void payTution(int payment)      //use for calculate the Fees paid and shows our Balance
	{
		viewBalance();
		System.out.print("Enter Pay tuition fee: ");
		Scanner in=new Scanner(System.in);
		int payment1 =in.nextInt();
		tutionBalance=tutionBalance-payment1;
		System.out.println(("THANK YOU FOR YOUR payment:  "+payment1));
		System.out.println("\n");
		
		viewBalance();      //After paying Balance shows our Balance
	}
	

	//Show Status
	public String toString(){             //use for show the Entire Details
		return  "\n*****************************"+""+ 
	            "\nShow Status: "+"\n*******************************"+
	            "\nName:" +firstName1 +" "+lastName+
				"\nCourseCode : "+courseCode +
				"\nStudentID   :  "+studentID+
				"\ncourses Enroll:"+courses+ "\nView Remaining Balance: "+tutionBalance+
				"\n***************************";
				
	}
	
		
	
}
