import java.util.*;

public class TeacherMenu{
	public String roll;
	Scanner s;

	public void authTeacher(){
		s=new Scanner(System.in);
		System.out.println("Enter your teacherID");
		String teacherID = s.next();
		System.out.println("Enter the password");
		/*add a password checking function for the teacher
		and when the authentication is successful then call the teacherMenu
		*/

	}
	public void teacherStudent(){
		System.out.println("With great power comes greater responsibilities \n");
      	System.out.println("Enter the roll number of the student");
      	s = new Scanner(System.in);
      	roll = s.next();
      	/* Now find the students as per the roll, after getting the student call the teacherMenu */
	}
	public int teacherMenu(){
		s=new Scanner(System.in);	
		int opt=0;
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("What you want to do...");
      System.out.println("1. View Students List");
      System.out.println("2. View details of a particular student");
      System.out.println("3. Add students");
      System.out.println("4. Delete student(s)");
      System.out.println("5. Edit student(s)");

      System.out.println("6. Exit");
      System.out.print("*===>> ");
      opt=s.nextInt();
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      return opt;
	}

	 public int run(){
    while(true){
      int opt=teacherMenu();
      switch(opt){
        case 1: DisplayStudents ds = new DisplayStudents();
                ds.printStudents();
                break;
        case 2: System.out.println("Enter the roll number");
                Scanner s= new Scanner(System.in);
                roll = s.next();
                run2();
                break;
        case 3: AddStudent as = new AddStudent();
                as.Add();
        		    //use the display function to display
                break;
        case 4: 
        		    //display the after achv.
                break;
        case 5: 
        		    //display the before achv.
        		    break;
        case 6: DisplayAttendance da = new DisplayAttendance(roll);
        		    //display the attendance
        		    break;
        case 7: 
                break;
        case 9: return 0;
      }
    }
  }

    public int teacherMenu2(){
    s=new Scanner(System.in); 
    int opt=0;
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("What you want to know about this student");
      System.out.println("1. View Student's profile");
      System.out.println("2. View Student's marks");
      System.out.println("3. Add marks");
      System.out.println("4. View marks");
      System.out.println("5. Add Attendance");
      System.out.println("6. View Attendance");
      System.out.println("7. Exit");
      System.out.print("*===>> ");
      opt=s.nextInt();
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      return opt;
    }

    public int run2(){
    while(true){
      int opt=teacherMenu2();
      switch(opt){
        case 1: StudentProfile sf = new StudentProfile(roll);
                break;
        case 2: ArrayList<Exam> marksList=new ArrayList<Exam>();
                for(Exam obj:marksList) {
                if (obj.getRollno().equals(roll)) {
                    obj.print();
                }
                }
                break;
        case 3: AddMarks am = new AddMarks(roll);
                am.Add(roll);
                break;
        case 4: ExamInfo ex = new ExamInfo(roll);
                break;
        case 5: AddAttendance aa = new AddAttendance(roll);
                aa.Add(roll);
                break;
        case 6: DisplayAttendance da = new DisplayAttendance(roll);
                break;
        case 7: return 0;
      }
  }
}
}
