import java.io.File;
import java.util.ArrayList;

public class AttendanceManipulation {
        ArrayList<Attendance> attendanceList;
        Attendance attendancedetails;

    public AttendanceManipulation(){
        attendancedetails = new Attendance();
    }

        public AttendanceManipulation(String roll){
            attendancedetails = new Attendance(roll);
        }

        public boolean check(String file){
            String filename = "../files/"+file;
            File f=new File(filename);
            if(f.exists())
                return true;
            else
                return false;
        }

        public boolean getAttendance(){
            if(check("Attendance")){
                attendanceList=Attendance.get();
                return true;
            }
            else{
                attendanceList=new ArrayList<Attendance>();
                return false;
            }
        }
    public void search_by_roll(String roll){
        getAttendance();
        int count = 0 ;
        for(Attendance obj:attendanceList){
            if(obj.getRollno().equals(roll)){
                obj.print_attendance();
                count++;
            }
        }
        if(count<1){
            System.out.println("Student not found, try adding the student");
        }
    }
    }


