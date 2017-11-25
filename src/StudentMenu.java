import java.util.*;

public class StudentMenu{
	public String roll;
	Scanner s;

  public StudentMenu(String roll){
      this.roll = roll;
  }
	public void authstudent(){
		s=new Scanner(System.in);
		System.out.println("Enter your studentID");
		String studentID = s.next();
		System.out.println("Enter the password");
		/*add a password checking function for the teacher
		and when the authentication is successful then call the teacherMenu
		*/

	}
	
	public int studentMenu(){
		s=new Scanner(System.in);	
		int opt=0;
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("What you want to do...");
      System.out.println("1. See your profile");
      System.out.println("2. Edit contact details");
      System.out.println("3. Change your course details");
      System.out.println("4. See your exam grades and scores");
      System.out.println("5. Achievements");
      System.out.println("6. Attendance");
      System.out.println("7. Fines");
      System.out.println("8. Fee Details");
      System.out.println("9. Exit");
      System.out.print("-> ");
      opt=s.nextInt();
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      return opt;
	}

	 public int run(){
    while(true){
      int opt=studentMenu();
      switch(opt){
        
        
        case 1: StudentProfile sf = new StudentProfile(roll);
                break;
        case 2: EditContact ec = new EditContact();
                break;
        case 3: System.out.print("Enter Roll No. : ");
                DisplayCourses dc = new DisplayCourses(s.next());
                dc.run();
                break;
        case 4: ExamInfo ex = new ExamInfo(roll);
        		    //use the display function to display
                break;
        case 5:// AfterAchievements aa = new AfterAchievements();
        		   // aa.print();
        		    //display the after achv.
                break;
        case 6:DisplayAttendance da = new DisplayAttendance(roll);
        		    //display the attendance
        		    break;
        case 7: StudentFines sfs = new StudentFines();
        		    sfs.print_fine();
        		    //display all the fines
        		    break;
        case 8: StudentFees sfe = new StudentFees();
        		    sfe.print();
        		    //display the fee
        		    break;
        case 9: return 0;
      }
    }
  }

}