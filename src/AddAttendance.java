import java.util.*;
import java.io.*;

public class AddAttendance
    {
        public Attendance newattendance;
        public ArrayList<Attendance> attendanceList = new ArrayList<Attendance>();

        AddAttendance(String roll){
            newattendance=new Attendance();
            newattendance.setDetails();
        }

        AddAttendance(Attendance a){
            newattendance=a;
        }

        public void Add(String roll){
            attendanceList.add(newattendance);
            Attendance.put(attendanceList);


        }
    }

