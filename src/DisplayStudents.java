public class DisplayStudents extends StudentManipulation{
  public DisplayStudents(){
    super();
  }

  public void printStudents(){
    if(!getStudents()){
      System.out.println("List is empty, sorry no students...Try adding them");
      System.out.println();
      return;
    }
    for(StudentDetails obj:stList){
      obj.print_names();
    }
  }
}