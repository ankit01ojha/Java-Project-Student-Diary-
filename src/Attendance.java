import java.util.*;
import java.io.*;

public class Attendance extends Attendancefile implements Serializable{
	String code;
	int attendance;
	String roll;

	Attendance(){
		code="";
		attendance=0;
		roll="";
	}

	Attendance(String roll){
		code="";
		attendance=0;
		roll=roll;
	}

	Attendance(String cd,int attendance, String roll){
		code=cd;
		attendance=attendance;
		roll=roll;
	}

	public void setDetails(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Course Code : ");
		code=s.nextLine();
		System.out.print("Enter Attendance : ");
		attendance=s.nextInt();
		System.out.println();
		roll = roll;
	}


	public String getCourseCode(){
		return code;
	}

	public int getAttendance(){ return attendance; }

	public String getRollno(){ return roll; }


	public boolean equals(Attendance a){
		return this.code.trim().equals(a.code.trim());
	}

	public String toString(){
		return roll+"\t"+code+"\t"+attendance;
	}

	public void print_attendance(){
		System.out.println("+-------------------------------------------+");
		System.out.println(String.format("|  CourseCode.: %-30s |\n|  Attendance: %-30d |",code,attendance));
		System.out.println("|-------------------------------------------|");
	}

}
