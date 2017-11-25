import java.util.*;

public class ParentMenu{
	public String roll;
	Scanner s;

	public void authParent(){
		s=new Scanner(System.in);
		System.out.println("Enter your parentID");
		String parentID = s.next();
		System.out.println("Enter the password");
		/*add a password checking function for the teacher
		and when the authentication is successful then call the teacherMenu
		*/

	}
	public void parentStudent(){
		System.out.println("With great power comes greater responsibilities \n");
      	System.out.println("Enter the roll number of the student");
      	s = new Scanner(System.in);
      	roll = s.next();
      	/* Now find the students as per the roll, after getting the student call the teacherMenu */
	}
	public int parentMenu(){
		s=new Scanner(System.in);	
		int opt=0;
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("What you want to know about your child");
      System.out.println("1. Exam Grades and Scores");
      System.out.println("2. Acheivements (during the college period)");
      System.out.println("3. Attendance");
      System.out.println("4. Fines");
      System.out.println("5. Fee Details");
      System.out.println("6. Exit");
      System.out.print("-> ");
      opt=s.nextInt();
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      return opt;
	}

	 public int run(){
    while(true){
      int opt=parentMenu();
      switch(opt){
        
        
        case 1: ExamInfo ex = new ExamInfo(roll);

        		//use the display function to display
                break;
        case 2: AfterAchievements aa = new AfterAchievements();
        		aa.print();
        		//display the after achv.
                break;
        
        case 3: DisplayAttendance da = new DisplayAttendance(roll);
        		//display the attendance
        		break;
        case 4: StudentFines sf = new StudentFines();
        		sf.print_fine();
        		//display all the fines
        		break;
        case 5: StudentFees sfe = new StudentFees();
        		sfe.print();
        		//display the fee
        		break;
        case 6: return 0;
      }
    }
  }

}