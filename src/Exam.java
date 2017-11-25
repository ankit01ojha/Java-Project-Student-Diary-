import java.util.*;
import java.io.*;

public class Exam extends Examfile implements Serializable{
  String code;
  String roll;
  int p1marks;
  int p2marks;
  int internals;
  int sem_marks;
  int final_score;


  Exam(String roll){
    code="";
    p1marks = 0;
    p2marks = 0;
    sem_marks = 0;
    final_score=0;
    internals = 0;
    roll = roll;

  }

  Exam(String cd, int p1marks, int p2marks,int internals, int sem_marks, String roll){
    code=cd;
    p1marks=p1marks;
    p2marks=p2marks;
    sem_marks=sem_marks;
    internals = internals;
    roll = roll;
  }

  public void setDetails(){
    Scanner s=new Scanner(System.in);
    roll =roll;
    System.out.print("Enter Course Code : ");
    code=s.nextLine();
    System.out.print("Enter Periodical 1 marks : ");
    p1marks=s.nextInt();
    System.out.println("Enter Periodical 2 marks");
    p2marks = s.nextInt();
    System.out.println("Enter the internals");
    internals = s.nextInt();
    System.out.println("Enter end_sem marks");
    sem_marks = s.nextInt();

  }

  public void setCourseCode(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.nextLine();
  }

  public String getCourseCode(){
    return code;
  }

  public int getP1(){
    return p1marks;
  }

  public int getP2(){
    return p2marks;
  }

  public int getInternals(){
    return internals;
  }

  public int getFinal(){
    final_score = (p1marks/3) + (p2marks/3) + internals+sem_marks;
    return final_score;
  }
  public String getRollno(){
    return roll;
  }

  public boolean equals(Exam e){
    return this.code.trim().equals(e.code.trim());
  }

  public String toString(){
    return roll+"\t"+code+"\t"+final_score;
  }

  public void print(){
    System.out.println("+-------------------------------------------+");
    System.out.println(String.format("|  CourseCode.: %-30s |\n|  p1marks: %-30d | p2marks: %-30s |\n| sem_marks: %-30s |\n| Final score: %-30s|",code,p1marks,p2marks,sem_marks,final_score));
    System.out.println("|-------------------------------------------|");
  }

}
