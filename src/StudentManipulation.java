import java.io.*;
import java.util.*;


public class StudentManipulation{
	ArrayList<StudentDetails> stList;
	StudentDetails stdetails;

	public StudentManipulation(){
		stdetails = new StudentDetails();
	}

	public StudentManipulation(String roll){
		stdetails = new StudentDetails(roll);
	}

	public boolean check(String file){
		String filename = "../files/"+file;
		File f=new File(filename);
		if(f.exists())
			return true;
		else
			return false;
	}

	public boolean getStudents(){
    if(check("Students")){
      stList=StudentDetails.get();
      return true;
    }
    else{
      stList=new ArrayList<StudentDetails>();
      return false;
    }
  }

  public int search_by_object(StudentDetails sd){
    getStudents();
    for(StudentDetails obj:stList){
      if(obj.equals(sd))
        return stList.indexOf(obj);
    }
    return -1;
  }

  public void search_by_roll(String roll){
  	getStudents();
    int count = 0 ;
  	for(StudentDetails obj:stList){
  		if(obj.getRollno().equals(roll)){
  			obj.print();
        count++;
  		}
  	}
    if(count<1){
      System.out.println("Student not found, try adding the student");
    }
  }



}