import java.util.*;
import java.io.*;

public class StudentFines extends FineFiles implements Serializable{
	String code;
	int fine;
	String roll;

	StudentFines(){
		code="";
		fine=0;
		roll="";
	}

	StudentFines(String roll){
		code="";
		fine=0;
		roll=roll;
	}

	StudentFines(String cd,int fine, String roll){
		code=cd;
		fine=fine;
		roll=roll;
	}

	public void setDetails(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Course Code : ");
		code=s.nextLine();
		System.out.print("Enter Fine : ");
		fine=s.nextInt();
		System.out.println();
		roll = roll;
	}


	public String getCourseCode(){
		return code;
	}

	public int getStudentFine(){ return fine; }

	public String getRollno(){ return roll; }


	public boolean equals(StudentFines f){
		return this.code.trim().equals(f.code.trim());
	}

	public String toString(){
		return "\t"+code+"\t"+fine;
	}

	public void print_fine(){
		System.out.println("+-------------------------------------------+");
		System.out.println(String.format("|  CourseCode.: %-30s |\n|  Fine: %-30d |",code,fine));
		System.out.println("|-------------------------------------------|");
	}

}
