import java.util.*;

public class CounsellorMenu{
	public String roll;
	Scanner s;
	private String password;

	public void authCounsellor(){
		s=new Scanner(System.in);
		System.out.println("Enter your counsellorID");
		String counsellorID = s.next();
		System.out.println("Enter the password");
		password = s.next();
		/*add a password checking function for the teacher
		and when the authentication is successful then call the teacherMenu
		*/

	}
	public void counsellorStudent(){
		System.out.println("With great power comes greater responsibilities \n");
      	System.out.println("Enter the roll number of the student");
      	s = new Scanner(System.in);
      	roll = s.next();
      	/* Now find the students as per the roll, after getting the student call the teacherMenu */
	}
	public int counsellorMenu(){
		s=new Scanner(System.in);	
		int opt=0;
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("What you want to know about this student");
      System.out.println("1. Contact Details");
      System.out.println("2. Exam Grades and Scores");
      System.out.println("3. Acheivements (during the college period)");
      System.out.println("4. Acheivements (before coming to the college)");
      System.out.println("5. Attendance");
      System.out.println("6. Fines");
      System.out.println("7. Fee Details");
      System.out.println("8. Exit");
      System.out.print("-> ");
      opt=s.nextInt();
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      return opt;
	}

	 public int run(){
    while(true){
      int opt=counsellorMenu();
      switch(opt){
        case 1: StudentProfile sc = new StudentProfile(roll);
        		//use the contact display function in the class
                break;
        case 2: DisplayCourses dc = new DisplayCourses(roll);
                dc.run();
                break;
        case 3: ExamInfo ex = new ExamInfo(roll);

        		//use the display function to display
                break;
        case 4: AfterAchievements aa = new AfterAchievements();
        		aa.print();
        		//display the after achv.
                break;
        case 5: BeforeAchievements ba = new BeforeAchievements();
        		ba.print();
        		//display the before achv.
        		break;
        case 6: DisplayAttendance da = new DisplayAttendance(roll);
        		//display the attendance
        		break;
        case 7: StudentFines sf = new StudentFines();
        		sf.print_fine();
        		//display all the fines
        		break;
        case 8: StudentFees sfe = new StudentFees();
        		sfe.print();
        		//display the fee
        		break;
        case 9 : return 0;
      }
    }
  }
}