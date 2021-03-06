import java.io.*;
import java.util.*;


public class StudentDetails extends StudentDetailsfh implements Serializable{
  String rollno;
  String name;
  int sem;

  StudentDetails(){
    rollno="";
    name="";
    sem=0;
  }

  StudentDetails(String rno){
    rollno=rno;
    name="";
    sem=0;
  }

  StudentDetails(String rno,String nm,int s){
    rollno=rno;
    name=nm;
    sem=s;
  }

  public boolean equals(StudentDetails obj){
    return this.rollno.equals(obj.getRollno());
  }

  public void setRollno(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Roll no. : ");
    rollno=s.nextLine();
  }

  public String getRollno(){
    return rollno;
  }

  public String getName(){
    return name;
  }

  public int getSem(){
    return sem;
  }

  public void setDetails(){
    Scanner s=new Scanner(System.in);
    
    // entry of roll number
    String tmproll="";
    while(tmproll.length()==0){
      System.out.print("Enter Roll no. : ");
      tmproll=s.nextLine();
      if(tmproll.length()==0 && rollno.length()!=0)
          break;
      if(tmproll.length()!=0)
          rollno=tmproll;
    }

    //entry of name
    String tmp="";
    System.out.print("Enter Name : ");
    tmp=s.nextLine();
    if(tmp.length()!=0)
        name=tmp;
    
    //entry of semester
    int temp;
    System.out.print("Enter sem : ");
    temp=Functions.getint();
    if(temp!=0)
      sem=temp;
    System.out.println();
  }

  public boolean map(){
    ArrayList<StudentDetails> al=StudentDetails.get();
    boolean flag=false;
    for(StudentDetails obj:al){
      if(this.equals(obj)==true){
        this.name=obj.getName();
        this.sem=obj.getSem();
        flag=true;
        break;
      }
    }
    return flag;
  }

  public void print(){
    System.out.println("+-------------------------------------------+");
    System.out.println(String.format("|  Name: %-34s |\n|  Roll No.: %-30s |\n|  Semester: %-30d |",name,rollno,sem));
    System.out.println("|-------------------------------------------|");
  }

  public String toString(){
    return "Name: "+name+'\n'+"Roll No.: "+rollno+"\nSemester : "+sem;
  }

  public void print_names(){
    System.out.println("+-------------------------------------------+-------------------------------------------+");
    System.out.println(String.format("|  Name: %-34s |  Roll No.: %-30s |",name,rollno));
    //System.out.println("|-------------------------------------------|-------------------------------------------|");
  }
  

}