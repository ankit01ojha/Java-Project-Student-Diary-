import java.util.*;

public class Starter{

    public int menu(){
      Scanner s=new Scanner(System.in);
      int opt=0;
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("Select who you are!");
      System.out.println("1. Student");
      System.out.println("2. Teacher");
      System.out.println("3. Parent");
      System.out.println("4. Counsellor");
      System.out.println("5. Exit");
      System.out.print("=> ");
      opt=s.nextInt();
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
      return opt;
  }

    public int run(){
    while(true){
      int opt=menu();
      switch(opt){
        case 1: System.out.println("Enter your roll no.");
                Scanner s = new Scanner(System.in);
                String roll = s.next();
                /*StudentManipulation sM = new StudentManipulation();
                ArrayList<StudentDetails> stList = new ArrayList<StudentDetails>();
                sM.getStudents();
                int count = 0 ;
                for(StudentDetails obj:stList){
                  if(obj.getRollno().equals(roll)){
                    StudentMenu sm = new StudentMenu(roll);
                    sm.run();
                    count++;
                  }
                }
                if(count<1){
                System.out.println("Student not found, try adding the student");
                }
                */
                StudentMenu sm = new StudentMenu(roll);
                sm.run();
                break;
        case 2: TeacherMenu tm = new TeacherMenu();
                tm.run();
                break;
        case 3: ParentMenu pm = new ParentMenu();
                pm.run();
                break;
        case 4: CounsellorMenu cm = new CounsellorMenu();
                cm.run();
                break;
        case 5: return -1;
      }
    }
  }

  public static void main(String arg[]){
    /*StudentDetails obj=new StudentDetails();
    obj.setDetails();
    ArrayList<StudentDetails> al=new ArrayList<StudentDetails>();
    al.add(obj);
    StudentDetails.put(al);
    */

    Starter st = new Starter();
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");

    st.run();
    

    
  }
}
